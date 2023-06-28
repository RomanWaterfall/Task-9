package ru.itmentor.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itmentor.spring.boot_security.demo.entity.User;
import ru.itmentor.spring.boot_security.demo.service.UserService;

import java.security.Principal;
@Controller
public class MyUserController {
    private final UserService userService;

   @Autowired
    public MyUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String pageForAuthenticatedUsers(ModelMap model, Principal principal) {
        String userName = principal.getName();
        User user = userService.findByName(userName);
        model.addAttribute("users", user);
        return "UserProfileInfo";
    }
}




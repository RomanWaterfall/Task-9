package ru.itmentor.spring.boot_security.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itmentor.spring.boot_security.demo.entity.User;
import ru.itmentor.spring.boot_security.demo.service.UserService;

import java.util.List;

@Controller
public class MyController {
    private final UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping(value = "/admin")
    public String showALLUsers(Model model) {

        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);

        return "index";
    }

    @RequestMapping("/admin/addNewUser")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "user-info";

    }

    @PostMapping("/admin/user-info")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/admin/updateInfo/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {


        model.addAttribute("user", userService.getUserById(id));
        return "1";
    }

    @PostMapping("/admin/1/{id}")
    public String getUserInfo(@PathVariable("id") int id, @ModelAttribute("user") User user) {
        userService.updateUser(id, user);
        return "redirect:/admin";
    }

    @GetMapping("/admin/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }
}







package ru.itmentor.spring.boot_security.demo.service;
import ru.itmentor.spring.boot_security.demo.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void deleteUser(Long id);

    User getUserById(long id);

    void updateUser(int id, User user);

    User findByUsername(String username);
}

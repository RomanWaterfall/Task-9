package ru.itmentor.spring.boot_security.demo.dao;

import ru.itmentor.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void saveUser(User user);

    User getUserById(Long id);

    void deleteUser(long id);

    void updateUser(int id, User user);

    User findByName(String username);
}

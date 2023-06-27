package ru.itmentor.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(getUserById(id));


    }

    @Override
    public void updateUser(int id, User user) {
        User user1 = getUserById((long) id);
        entityManager.merge(user);
    }

    @Override
    public User findByUsername(String name) {
        return entityManager.createQuery("FROM User WHERE name=:name",
                User.class).setParameter("name", name).getSingleResult();
    }

}
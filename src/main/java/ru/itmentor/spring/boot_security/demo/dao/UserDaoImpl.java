package ru.itmentor.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

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
        entityManager.merge(user);
    }



    public User findByName(String name) {
        String query = "SELECT u FROM User u LEFT JOIN FETCH u.roles WHERE u.name = :name";
        return entityManager.createQuery(query, User.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
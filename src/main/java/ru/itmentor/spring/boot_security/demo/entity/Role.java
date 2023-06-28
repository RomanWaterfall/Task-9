package ru.itmentor.spring.boot_security.demo.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Role(Long id, String name, Set<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }
    public Role() {

    }
    public String getName() {
        return name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    public Set<User> getUsers() {
        return users;
    }

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}





package com.softserve.agilesoftware.dao;

import com.softserve.agilesoftware.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ihorlt on 25.07.16.
 * Repository implementing methods that works with tables n the database
 * Long is a type if id field in User class
 */
public interface UserDAO extends CrudRepository<User, Long> {

    /**
     *
     * @param name is user email
     * @return User instance with specified email
     */
    public User findByEmail(String name);
}

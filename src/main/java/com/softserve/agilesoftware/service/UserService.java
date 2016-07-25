package com.softserve.agilesoftware.service;

import com.softserve.agilesoftware.entity.User;

/**
 * Created by ihorlt on 24.07.16.
 * Set of methods  for User class that implements this interface
 */
public interface UserService {

    /**
     * Finds the user by email in the table User
     */
    public User findByEmail(String email);

}

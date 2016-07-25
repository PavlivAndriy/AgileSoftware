package com.softserve.agilesoftware.service.impl;

import com.softserve.agilesoftware.dao.UserDAO;
import com.softserve.agilesoftware.entity.User;
import com.softserve.agilesoftware.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ihorlt on 25.07.16.
 * Implements using repository object acording to  service interface
 */
public class UserImpl implements UserService {

    public  static final Logger LOGGER = LoggerFactory.getLogger(UserImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findByEmail(String email) {
        User user = userDAO.findByEmail(email);
        LOGGER.debug("Got a user" + user.getFirstName() + "from database");
        return user;
    }
}

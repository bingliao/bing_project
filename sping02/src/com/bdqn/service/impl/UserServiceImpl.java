package com.bdqn.service.impl;

import com.bdqn.dao.UserDao;
import com.bdqn.entity.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }
}

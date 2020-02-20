package com.bdqn.dao.impl;

import com.bdqn.dao.UserDao;
import com.bdqn.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public String addUser(User user) {
        if(user!=null){
            return "成功";
        }
        return null;
    }
}

package com.bdqn.dao;

import com.bdqn.entity.User;

public interface UserDao {
    /**
     * 添加用户
     * @param user 用户
     * @return
     */
    String addUser(User user);
}

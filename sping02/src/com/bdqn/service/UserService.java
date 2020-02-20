package com.bdqn.service;

import com.bdqn.entity.User;

public interface UserService {
    /**
     * 添加用户
     * @param user 用户
     * @return
     */
    String addUser(User user);
}

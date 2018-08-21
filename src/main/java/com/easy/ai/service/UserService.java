package com.easy.ai.service;

import com.easy.ai.model.User;
import com.github.pagehelper.PageInfo;


public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

    int addUser(User user);

    int updateUser(User user);

}

package com.rokid.httpgw.service;

import com.github.pagehelper.PageInfo;
import com.rokid.httpgw.model.User;


public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

    int addUser(User user);

    int updateUser(User user);

}

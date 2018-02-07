package com.rokid.httpgw.service;


import com.rokid.httpgw.model.UserRole;

/**
 * Created by yangqj on 2017/4/26.
 */
public interface UserRoleService extends IService<UserRole> {

    public void addUserRole(UserRole userRole);
}

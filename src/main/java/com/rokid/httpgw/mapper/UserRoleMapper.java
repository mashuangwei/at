package com.rokid.httpgw.mapper;


import com.rokid.httpgw.model.UserRole;
import com.rokid.httpgw.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}
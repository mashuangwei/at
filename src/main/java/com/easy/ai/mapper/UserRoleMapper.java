package com.easy.ai.mapper;


import com.easy.ai.util.MyMapper;
import com.easy.ai.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}
package com.easy.ai.mapper;


import com.easy.ai.model.Role;
import com.easy.ai.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}
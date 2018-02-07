package com.rokid.httpgw.mapper;


import com.rokid.httpgw.model.Role;
import com.rokid.httpgw.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}
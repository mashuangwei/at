package com.easy.ai.mapper;

import com.easy.ai.model.ProjectModule;

public interface ProjectModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectModule record);

    int insertSelective(ProjectModule record);

    ProjectModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectModule record);

    int updateByPrimaryKey(ProjectModule record);
}
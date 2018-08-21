package com.easy.ai.mapper;

import com.easy.ai.model.ProjectVersionInfo;

public interface ProjectVersionInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectVersionInfo record);

    int insertSelective(ProjectVersionInfo record);

    ProjectVersionInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectVersionInfo record);

    int updateByPrimaryKey(ProjectVersionInfo record);
}
package com.easy.ai.service;

import com.easy.ai.model.Project;
import com.github.pagehelper.PageInfo;

public interface ProjectService {
    PageInfo<Project> selectAllByPage(int page_no, int page_size);
    int addProject(Project project);
    int updateProjectById(Project project);
    int deleteProjectById(int id);
}

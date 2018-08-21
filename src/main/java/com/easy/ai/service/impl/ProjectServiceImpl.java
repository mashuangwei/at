package com.easy.ai.service.impl;

import com.easy.ai.mapper.ProjectMapper;
import com.easy.ai.model.Project;
import com.easy.ai.model.Resources;
import com.easy.ai.service.ProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectServiceImpl  implements ProjectService {

    @Resource
    ProjectMapper projectMapper;

    @Override
    public PageInfo<Project> selectAllByPage(int page_no, int page_size) {
        //分页查询
        PageHelper.startPage(page_no, page_size);
        List<Project> projectList = projectMapper.selectAll();
        return new PageInfo<>(projectList);
    }

    @Override
    public int addProject(Project project) {
        return projectMapper.insert(project);
    }

    @Override
    public int updateProjectById(Project project) {
        return projectMapper.updateByPrimaryKey(project);
    }

    @Override
    public int deleteProjectById(int id) {
        return projectMapper.deleteByPrimaryKey(id);
    }
}

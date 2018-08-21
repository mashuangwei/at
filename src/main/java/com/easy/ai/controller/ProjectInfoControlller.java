package com.easy.ai.controller;

import com.easy.ai.exception.Result;
import com.easy.ai.model.Project;
import com.easy.ai.service.impl.ProjectServiceImpl;
import com.easy.ai.util.ResultUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/project")
public class ProjectInfoControlller {
    @Autowired
    private ProjectServiceImpl projectService;

    @GetMapping("/get/all")
    public Result getAllProject(@RequestParam(required = false, defaultValue = "" + 1) int page_no,
                                @RequestParam(required = false, defaultValue = "" + 10) int page_size) {
        PageInfo<Project> projectPageInfo = projectService.selectAllByPage(page_no, page_size);
        return ResultUtil.success(200, projectPageInfo);
    }

    @PostMapping("/add")
    public Result addProject(@RequestBody Project project) {
        int code = projectService.addProject(project);
        if (code > 0) {
            return ResultUtil.success(200);
        }
        return ResultUtil.error(400, "添加项目失败");
    }

    @PostMapping("/update")
    public Result updateProject(@RequestBody Project project) {
        int code = projectService.updateProjectById(project);
        if (code > 0) {
            return ResultUtil.success(200);
        }
        return ResultUtil.error(400, "更新项目失败");
    }

    @PostMapping("/delete/{id}")
    public Result deleteProject(@PathVariable int id) {
        int code = projectService.deleteProjectById(id);
        if (code > 0) {
            return ResultUtil.success(200);
        }
        return ResultUtil.error(400, "删除项目失败");
    }
}

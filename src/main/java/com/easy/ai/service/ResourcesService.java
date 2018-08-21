package com.easy.ai.service;

import com.easy.ai.model.Resources;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;


public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    List<Resources> queryAll();

    List<Resources> loadUserResources(Map<String, Object> map);

    List<Resources> queryResourcesListWithSelected(Integer rid);
}

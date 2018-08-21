package com.easy.ai.mapper;


import com.easy.ai.model.Resources;
import com.easy.ai.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface ResourcesMapper extends MyMapper<Resources> {

    List<Resources> queryAll();

    List<Resources> loadUserResources(Map<String, Object> map);

    List<Resources> queryResourcesListWithSelected(Integer rid);
}
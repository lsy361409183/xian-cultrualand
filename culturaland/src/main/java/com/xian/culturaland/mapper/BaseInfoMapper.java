package com.xian.culturaland.mapper;

import com.xian.culturaland.entity.BaseInfo;

import java.util.List;

public interface BaseInfoMapper {
    //查询出文地的基本信息：区域、类别、名称、位置
    List<BaseInfo> selectAllInfo();
}

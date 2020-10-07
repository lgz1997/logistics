package com.ytc.mapper;

import com.ytc.model.County;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer countyid);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer countyid);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}
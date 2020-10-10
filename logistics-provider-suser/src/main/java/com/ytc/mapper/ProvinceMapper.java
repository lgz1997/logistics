package com.ytc.mapper;

import com.ytc.model.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceMapper {

    List<Province> selectProvince();

    Province selectProvincename(@Param("address1") Integer address1);
}
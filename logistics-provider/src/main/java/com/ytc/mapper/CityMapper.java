package com.ytc.mapper;

import com.ytc.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {

    List<City> selectCity();

    City selectCityname(@Param("address2") Integer address2);

    List<City> queryCity();
}
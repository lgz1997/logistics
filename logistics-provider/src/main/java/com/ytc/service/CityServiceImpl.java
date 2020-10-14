/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CityServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.CityMapper;
import com.ytc.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/7
 * @since 1.0.0
 */
@Service
@Component
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> selectCity() {
        return cityMapper.selectCity();
    }

    @Override
    public City selectCityname(Integer address2) {
        return cityMapper.selectCityname(address2);
    }

    @Override
    public List<City> queryCity() {
        return cityMapper.queryCity();
    }
}
/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FreightServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.FreightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
public class FreightServiceImpl implements FreightService{

    @Autowired
    private FreightMapper freightMapper;

    @Override
    public void zhifu(Integer orderid) {
        freightMapper.zhifu(orderid);
    }
}
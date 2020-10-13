/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: OrderServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.OrderMapper;
import com.ytc.model.Order;
import com.ytc.util.PageUtil;
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
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public PageUtil<Order> select(Order o, PageUtil<Order> page) {
        long count=orderMapper.selectCount(o);
        page=new PageUtil<Order>(page.getCpage(),count,page.getPageSize());
        List<Order> list=orderMapper.select(o,page.getStart(),page.getPageSize());
        page.setList(list);
        return page;
    }

    @Override
    public Order details(Integer id) {
        return orderMapper.details(id);
    }

    @Override
    public void pztuidan(Integer id) {
        orderMapper.pztuidan(id);
    }
}
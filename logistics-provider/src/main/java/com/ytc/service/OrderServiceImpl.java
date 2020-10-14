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
import com.ytc.mapper.*;
import com.ytc.model.Cuser;
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

    @Autowired
    private HarvestMapper harvestMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private FreightMapper freightMapper;

    @Autowired
    private AcceptMapper acceptMapper;


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

    @Override
    public void addSendCuser(Order order) {
        orderMapper.addSendCuser(order);
        harvestMapper.addSendCuser(order);
        goodsMapper.addSendCuser(order);
        freightMapper.addSendCuser(order);
        acceptMapper.addSendCuser(order);
    }

    @Override
    public List<Order> queryCuserSend(Cuser cuser) {
        return orderMapper.queryCuserSend(cuser);
    }

    @Override
    public void tuidan(Integer orderid) {
        orderMapper.tuidan(orderid);
    }
}
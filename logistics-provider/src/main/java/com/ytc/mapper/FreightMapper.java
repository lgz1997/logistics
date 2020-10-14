package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

public interface FreightMapper {

    void addSendCuser(@Param("order") Order order);

    void zhifu(@Param("orderid")Integer orderid);
}
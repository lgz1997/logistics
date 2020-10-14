package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

public interface HarvestMapper {

    void addSendCuser(@Param("order") Order order);

    void shouHuo(@Param("orderid") Integer orderid);
}
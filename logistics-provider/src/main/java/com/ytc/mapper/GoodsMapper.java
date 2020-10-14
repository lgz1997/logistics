package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {

    void addSendCuser(@Param("order") Order order);
}
package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    List<Order> select(@Param("o") Order o);

    Order details(@Param("id")Integer id);
}
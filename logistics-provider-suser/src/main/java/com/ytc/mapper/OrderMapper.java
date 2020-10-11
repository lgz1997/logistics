package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    Order details(@Param("id")Integer id);

    long selectCount(@Param("o")Order o);

    List<Order> select(@Param("o")Order o, @Param("start")int start, @Param("pageSize")int pageSize);
}
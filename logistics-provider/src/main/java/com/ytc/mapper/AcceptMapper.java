package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;

public interface AcceptMapper {

    void accept(@Param("id") Integer id);

    void noaccept(@Param("id")Integer id, @Param("idea")String idea);

    void addSendCuser(@Param("order") Order order);
}
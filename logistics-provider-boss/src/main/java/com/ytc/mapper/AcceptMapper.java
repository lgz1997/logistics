package com.ytc.mapper;

import org.apache.ibatis.annotations.Param;

public interface AcceptMapper {

    void accept(@Param("id") Integer id);

    void noaccept(@Param("id")Integer id, @Param("idea")String idea);
}
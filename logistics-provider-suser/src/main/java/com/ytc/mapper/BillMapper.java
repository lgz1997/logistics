package com.ytc.mapper;

import com.ytc.model.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {

    void water(@Param("b") Bill bill);

    long selectCount(@Param("suserid")Integer suserid);

    List<Bill> select(@Param("suserid")Integer suserid, @Param("start")int start, @Param("pageSize")int pageSize);
}
package com.ytc.mapper;

import com.ytc.model.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {

    void water(@Param("b") Bill bill);

    long selectCount(@Param("suserid")Integer suserid);

    List<Bill> select(@Param("suserid")Integer suserid, @Param("start")int start, @Param("pageSize")int pageSize);

    void tuidan(@Param("b")Bill bill);

    void shouhuo(@Param("price") Double price, @Param("suserid")Integer suserid, @Param("billdealid")String billdealid);
}
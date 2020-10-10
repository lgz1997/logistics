package com.ytc.mapper;

import com.ytc.model.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {

    List<Bill> select(@Param("suserid") int suserid);

    void water(@Param("b") Bill bill);
}
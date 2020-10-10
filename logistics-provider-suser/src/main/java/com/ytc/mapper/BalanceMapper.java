package com.ytc.mapper;

import com.ytc.model.Balance;
import org.apache.ibatis.annotations.Param;

public interface BalanceMapper {

    Balance select(@Param("suserid") int suserid);
}
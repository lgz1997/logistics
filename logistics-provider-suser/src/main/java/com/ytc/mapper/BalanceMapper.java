package com.ytc.mapper;

import com.ytc.model.Balance;
import org.apache.ibatis.annotations.Param;

public interface BalanceMapper {

    Balance select(@Param("suserid") int suserid);

    void tixian(@Param("suserid") Integer suserid,@Param("money") Double money);

    void add(@Param("id") Integer id);
}
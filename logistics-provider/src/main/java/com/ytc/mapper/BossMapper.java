package com.ytc.mapper;

import com.ytc.model.Boss;
import org.apache.ibatis.annotations.Param;


public interface BossMapper {

    Boss bossLogin(@Param("boss")Boss boss);

    void reg(@Param("boss") Boss boss);//114去xml

    void del(@Param("boss")Boss boss);

    Boss queryBossByName(@Param("boss")Boss boss);

}
package com.ytc.mapper;

import com.ytc.model.Freightcalculation;
import com.ytc.model.Suser;
import org.apache.ibatis.annotations.Param;

public interface FreightcalculationMapper {

    Freightcalculation sel(@Param("s") Suser suser);

    void upf(@Param("f") Freightcalculation freightcalculation);

    void add(@Param("id") Integer id);
}
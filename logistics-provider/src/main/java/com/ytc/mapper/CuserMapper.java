package com.ytc.mapper;

import com.ytc.model.Cuser;
import org.apache.ibatis.annotations.Param;

public interface CuserMapper {

    Cuser queryCuserName(@Param("cuser") Cuser cuser);

    void AddCuser(@Param("cuser") Cuser cuser);
}
package com.ytc.mapper;

import com.ytc.model.Suser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuserMapper {

    Suser suserLogin(Suser suser);

    Suser querySuserByName(Suser suser);//107去xml

    void reg(@Param("suser") Suser suser);//114去xml

    void del(@Param("suser")Suser suser);

    List<Suser> sel();

    void sh(@Param("id") Integer id);

    void nosh(@Param("id")Integer id);
}
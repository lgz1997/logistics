/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SuserService
 * Author:   没闹~
 * Date:     2020/10/5 11:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Suser;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/5
 * @since 1.0.0
 */
public interface SuserService {


    Suser suserLogin(Suser suser);

    Suser querySuserByName(Suser suser);//105直接去impl

    void reg(Suser suser);//112去impl

    void del(Suser suser);

    List<Suser> sel();

    void sh(Integer id);

    void nosh(Integer id);

    List<Suser> querySuser();
}
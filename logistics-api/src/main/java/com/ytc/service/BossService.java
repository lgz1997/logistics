/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BossService
 * Author:   没闹~
 * Date:     2020/10/5 11:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Boss;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/5
 * @since 1.0.0
 */
public interface BossService {

    Boss bossLogin(Boss boss);

    void reg(Boss boss);//112去impl

    void del(Boss boss);

    Boss queryBossByName(Boss boss);
}
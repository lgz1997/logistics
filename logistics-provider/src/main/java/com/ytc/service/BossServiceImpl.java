/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BossServiceImpl
 * Author:   没闹~
 * Date:     2020/10/7 14:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.BossMapper;
import com.ytc.model.Boss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/7
 * @since 1.0.0
 */
@Service
@Component
public class BossServiceImpl implements BossService{

    @Autowired
    private BossMapper bossMapper;

    @Override
    public Boss bossLogin(Boss boss) {
        return bossMapper.bossLogin(boss);
    }

    public void reg(Boss boss) {
        bossMapper.reg(boss);
    }

    @Override
    public void del(Boss boss) {
        bossMapper.del(boss);
    }

    @Override
    public Boss queryBossByName(Boss boss) {
        return bossMapper.queryBossByName(boss);
    }
}
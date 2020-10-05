/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BossController
 * Author:   没闹~
 * Date:     2020/10/5 11:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.service.BossService;
import com.ytc.service.SuserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/5
 * @since 1.0.0
 */
@Controller
@RequestMapping("/boss")
public class BossController {

    @Reference
    private BossService bossService;

    @Reference
    private SuserService suserService;
}
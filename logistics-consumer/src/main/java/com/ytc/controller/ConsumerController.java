/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ConsumerController
 * Author:   没闹~
 * Date:     2020/10/7 14:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/7
 * @since 1.0.0
 */
@Controller
@RequestMapping("/logistics")
public class ConsumerController {

    @Reference
    private AcceptService acceptService;

    @Reference
    private BossService bossService;

    @Reference
    private CityService cityService;

    @Reference
    private CuserService cuserService;

    @Reference
    private FreightcalculationService freightcalculationService;

    @Reference
    private FreightService freightService;

    @Reference
    private GoodsService goodsService;

    @Reference
    private HarvestService harvestService;

    @Reference
    private OrderService orderService;

    @Reference
    private ProvinceService provinceService;

    @Reference
    private SuserService suserService;

    @Reference
    private  DrawService drawService;

    @Reference
    private BalanceService balanceService;

    @Reference
    private BillService billService;

    @RequestMapping("cuserLogin")
    public String cuserLogin(){
        return "cuserLogin.html";
    }
    @RequestMapping("suserLogin")
    public String suserLogin(){
        return "suserLogin.html";
    }
    @RequestMapping("bossLogin")
    public String bossLogin(){
        return "bossLogin.html";
    }

    @RequestMapping("top")
    public String top(){
        return "frame/top.html";
    }
    @RequestMapping("left")
    public String left(){
        return "frame/left.html";
    }
    @RequestMapping("center")
    public String center(){
        return "frame/center.html";
    }

    @RequestMapping("test")
    public String test(){
        return "suserShow.html";
    }
}
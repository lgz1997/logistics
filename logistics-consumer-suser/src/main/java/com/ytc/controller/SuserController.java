/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SuserController
 * Author:   没闹~
 * Date:     2020/10/5 11:42
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
 * @create 2020/10/5
 * @since 1.0.0
 */
@Controller
@RequestMapping("/suser")
public class SuserController {

    @Reference
    private SuserService suserService;

    @Reference
    private AcceptService acceptService;

    @Reference
    private FreightService freightService;

    @Reference
    private GoodsService goodsService;

    @Reference
    private HarvestService harvestService;

    @Reference
    private ProvinceService provinceService;

    @Reference
    private CityService cityService;

    @Reference
    private CountyService countyService;
}
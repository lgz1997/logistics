/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SuserController
 * Author:   没闹~
 * Date:     2020/10/9 7:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.org.apache.xpath.internal.operations.Or;
import com.ytc.controller.util.RandomIDUtil;
import com.ytc.model.*;
import com.ytc.service.*;
import org.apache.zookeeper.data.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 没闹~
 * @create 2020/10/9
 * @since 1.0.0
 */
@Controller
@RequestMapping("/suser")
public class SuserController {

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

    @RequestMapping("top")
    public String top(){
        return "suser/frame/top.html";
    }
    @RequestMapping("left")
    public String left(){
        return "suser/frame/left.html";
    }
    @RequestMapping("center")
    public String center(){
        return "suser/frame/center.html";
    }

    @RequestMapping("test")
    public String test(){
        return "suser/suserShow.html";
    }

    @RequestMapping("toOrderShow")
    public String toOrderShow(Model m){
        return "suser/toOrderShow.html";
    }

    @RequestMapping("selectProvince")
    @ResponseBody
    public List<Province> selectProvince(){
        List<Province> list=provinceService.selectProvince();
        return list;
    }
    @RequestMapping("selectCity")
    @ResponseBody
    public List<City> selectCity(){
        List<City> list=cityService.selectCity();
        return list;
    }

    @RequestMapping("select")
    public String select(Model m,Order o,Integer valuename,String whatname,Integer address,Integer address1,Integer address2){
        String str="";
        if(address1!=null){
           Province p=provinceService.selectProvincename(address1);
            str+=p.getProvincename();
       }
       if(address2!=null){
           City c=cityService.selectCityname(address2);
           str+=c.getCityname();
       }

        if(valuename==1){
            o.setOrdercard(whatname);
        }else if (valuename==2){
            o.setShipper(whatname);
        }else if(valuename==3){
            o.setShipperiphone(whatname);
        }
        if(address==1){
            o.setShipperaddress(str);
        }else if(address==2){
            o.setConsigneeaddress(str);
        }
        List<Order>list=orderService.select(o);
        m.addAttribute("list",list);
        return "suser/orderShow.html";
    }

    @RequestMapping("details")
    public String details(Model m,Integer id){
        Order o = orderService.details(id);
        m.addAttribute("o",o);
        return "suser/details.html";
    }

    @RequestMapping("yesaccept")
    @ResponseBody
    public void yesaccept(Integer id){
        acceptService.accept(id);
    }
    @RequestMapping("noaccept")
    @ResponseBody
    public void noaccept(Integer id,String idea){
        acceptService.noaccept(id,idea);
    }

    @RequestMapping("bill")
    public String bill(Model m,Integer suserid){
        List<Bill> list=billService.select(1);
        m.addAttribute("list",list);
        Balance balance=balanceService.select(1);
        m.addAttribute("balance",balance);
        return "suser/bill.html";
    }
    @RequestMapping("tixian")
    @ResponseBody
    public void tixian(Integer suserid, Double money){
        balanceService.tixian(suserid, money);
        Bill bill= new Bill();
        RandomIDUtil ra=new RandomIDUtil();
        Long id = ra.nextId();
        String str="XL"+id;
        bill.setSuserid(suserid);
        bill.setBilldealid(str);
        bill.setBillprice(money);
        billService.water(bill);
    }

}
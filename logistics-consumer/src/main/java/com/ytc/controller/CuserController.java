/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CuserController
 * Author:   没闹~
 * Date:     2020/10/9 7:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.controller.util.RandomIDUtil;
import com.ytc.model.*;
import com.ytc.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
@RequestMapping("/cuser")
public class CuserController {

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
    private BalanceService balanceService;

    @Reference
    private BillService billService;

    /**
     * 普通用户登录
     * @param cuser
     * @return
     */
    @RequestMapping("queryCuserList")
    @ResponseBody
    public String queryCuserList(Cuser cuser, HttpSession session){
        Cuser cuser1 = cuserService.queryCuserName(cuser);
        if(cuser1!=null){
            if(cuser1.getCuserpwd().equals(cuser.getCuserpwd())){
                session.setAttribute("cuser",cuser1);
                return "3";
            }else{
                return "2";
            }

        }else{
            return "1";
        }

    }

    /**
     * 登录成功跳转成功页面
     * @return
     */

    @RequestMapping("queryShow")
    public String queryShow(){
        return "cuser/cuserFrameset.html";
    }

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("regiter")
    public String regiter(){
        return "/cuser/cuserRegiter.html";
    }

    /**
     * 注册
     * @param cuser
     */
    @RequestMapping("AddCuser")
    @ResponseBody
    public void AddCuser(Cuser cuser){
        cuserService.AddCuser(cuser);
    }

    /**
     * 注册成功跳转页面
     * @return
     */
    @RequestMapping("succeReg")
    public String succeReg(){
        return "/cuser/cuserLogin.html";
    }

    /**
     * 跳转寄件页面
     * @return
     */
    @RequestMapping("send")
    public String send(){
        return "/cuser/order/addOrderSend.html";
    }

    /**
     *查询省
     */
    @RequestMapping("queryAdress")
    @ResponseBody
    public List<Province> queryAdress(){
        List<Province> list = provinceService.queryAdress();
        return list;
    }
    /**
     *查询市
     */
    @RequestMapping("queryCity")
    @ResponseBody
    public List<City> queryCity(){
        List<City> list = cityService.queryCity();
        return list;
    }

    @RequestMapping("querySuser")
    @ResponseBody
    public List<Suser> querySuser() {
        List<Suser> list = suserService.querySuser();
        return list;
    }

    /**
     * 查询运费
     * @return
     */
    @RequestMapping("queryCalculation")
    @ResponseBody
    public Freightcalculation queryCalculation(Integer suserid) {
        Freightcalculation list = freightcalculationService.queryCalculation(suserid);
        return list;
    }


    /**
     * 寄件生成订单
     * @param order
     */
    @RequestMapping("addSendCuser")
    @ResponseBody
    public void addSendCuser(HttpSession session,Order order,Integer province2,Integer city2,String address2,Integer province1,Integer city1,String address1,Double goodsWeight){
        Cuser cuser = (Cuser) session.getAttribute("cuser");
        order.setCuserid(cuser.getCuserid());
        Double freightprice = order.getFreight().getFreightprice();
        order.getFreight().setFreightprice(Math.ceil(freightprice));
        String shipperaddress="";
        String consigneeaddress="";
        List<Province> provinces = queryAdress();
        for(int i = 0;i<provinces.size();i++){
            if(provinces.get(i).getProvinceid()==province1){
                shipperaddress+=provinces.get(i).getProvincename();
            }
            if(provinces.get(i).getProvinceid()==province2){
                consigneeaddress+=provinces.get(i).getProvincename();
            }
        }
        List<City> citys = queryCity();
        for(int j = 0;j<citys.size();j++){
            if(citys.get(j).getCityid()==city1){
                shipperaddress+=citys.get(j).getCityname();
            }
            if(citys.get(j).getCityid().equals(city2)){
                consigneeaddress+=citys.get(j).getCityname();
            }
        }
        shipperaddress+=address1;
        consigneeaddress+=address2;
        order.setShipperaddress(shipperaddress);
        order.setConsigneeaddress(consigneeaddress);
        if(order.getGoods().getGoodsweight()==4){
            order.getGoods().setGoodsweight(goodsWeight);
        }
        RandomIDUtil ra=new RandomIDUtil();
        long id = ra.nextId();
        order.setOrdercard("ZDK"+id);
        orderService.addSendCuser(order);
    }

    /**
     * 寄件订单生成成功跳转页面
     * @return
     */
    @RequestMapping("orderSuccess")
    public String orderSuccess(){
        return "/cuser/order/orderSuccess.html";
    }
    /**
     * 返回寄件订单页面
     * @return
     */
    @RequestMapping("backB")
    public String backB(){
        return "/cuser/frame/center.html";
    }

    /**
     * 返回原始页面
     * @return
     */
    @RequestMapping("backA")
    public String backA(){
        return "/cuser/order/addOrderSend.html";
    }

    /**
     * 查询并跳转我的快递页面
     * 查询
     * @return
     */
    @RequestMapping("queryCuserSend")
    public String queryCuserSend(Model model, HttpSession session){
        List<Suser> susers = querySuser();
        Cuser cuser = (Cuser) session.getAttribute("cuser");
        model.addAttribute("suser",susers);
        List<Order> list = orderService.queryCuserSend(cuser);
        model.addAttribute("list",list);
        return "/cuser/order/myQueryOrder.html";
    }
    @RequestMapping("shouHuo")
    @ResponseBody
    public void shouHuo(Integer orderid){
        harvestService.shouHuo(orderid);
    }

    @RequestMapping("zhifu")
    @ResponseBody
    public void zhifu(Integer orderid,Double price,Integer suserid){
        freightService.zhifu(orderid);
        balanceService.shouhuo(price,suserid);
        RandomIDUtil ra=new RandomIDUtil();
        long id = ra.nextId();
        String billdealid="XL"+id;
        billService.shouhuo(price,suserid,billdealid);
    }

    @RequestMapping("tuidan")
    @ResponseBody
    public void tuidan(Integer orderid){
        orderService.tuidan(orderid);
    }
}
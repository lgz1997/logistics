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
import com.ytc.util.CheckImgUtil;
import com.ytc.util.Md5Util;
import com.ytc.util.PageUtil;
import org.apache.zookeeper.data.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public String top(HttpServletRequest request,Model m){
        Suser suser=(Suser) request.getSession().getAttribute("suser");
        m.addAttribute("suser",suser);
        return "suser/frame/top.html";
    }

    @RequestMapping("noLogin")
    @ResponseBody
    public void noLogin(HttpServletRequest request){
        request.getSession().removeAttribute("suser");
    }
    @RequestMapping("left")
    public String left(){
        return "suser/frame/left.html";
    }
    @RequestMapping("center")
    public String center(){
        return "suser/frame/center.html";
    }

    @RequestMapping("suserShow")
    public String suserShow(){
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
    public String select(PageUtil<Order> page,Model m, Order o, Integer valuename, String whatname, Integer address, Integer address1, Integer address2, HttpServletRequest request){
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
        Suser suser=(Suser) request.getSession().getAttribute("suser");
        o.setSuserid(suser.getSuserid());
        page=orderService.select(o,page);
        m.addAttribute("page",page);
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

    @RequestMapping("tobill")
    public String tobill(){
        return "suser/tobill.html";
    }
    @RequestMapping("bill")
    public String bill(Model m,PageUtil<Bill> page,HttpServletRequest request){
        Suser suser=(Suser) request.getSession().getAttribute("suser");
        page=billService.select(suser.getSuserid(),page);
        m.addAttribute("page",page);
        Balance balance=balanceService.select(suser.getSuserid());
        m.addAttribute("balance",balance);
        return "suser/bill.html";
    }

    @RequestMapping("totixian")
    @ResponseBody
    public Suser totixian(HttpServletRequest request){
        Suser suser=(Suser) request.getSession().getAttribute("suser");
        return suser;
    }
    @RequestMapping("tixian")
    @ResponseBody
    public void tixian(Bill bill,HttpServletRequest request){
        Suser suser=(Suser) request.getSession().getAttribute("suser");
        balanceService.tixian(suser.getSuserid(),bill.getBillprice());
        RandomIDUtil ra=new RandomIDUtil();
        Long id = ra.nextId();
        String str="XL"+id;
        bill.setSuserid(suser.getSuserid());
        bill.setBilldealid(str);
        billService.water(bill);
    }


    @RequestMapping("suserLogin")
    @ResponseBody
    public String suserLogin(Suser suser, String imgcode , HttpServletRequest request){
        HttpSession session = request.getSession();//205处理爆红
        String checkcode = (String)session.getAttribute("checkcode");//205处理爆红
        if(!imgcode.equals(checkcode)){//205处理爆红
            return "3";//205处理爆红
        }//205处理爆红

        Suser suserReturn =suserService.suserLogin(suser);//205处理爆红

        if(suserReturn!=null){//205处理爆红
            String md516 = Md5Util.getMd516(suser.getSuserpwd());/*111*/
            if(md516.equals(suserReturn.getSuserpwd())){//205处理爆红
                if(suserReturn.getSuserstatus()==1){
                    //登录成功
                    session.setAttribute("suser",suserReturn);//205处理爆红
                    return "6";//205处理爆红
                }else if(suserReturn.getSuserstatus()==0){
                    return "5";//205处理爆红
                }else {
                    suserService.del(suser);
                    return "7";
                }
            }else {//205处理爆红
                //密码不正确
                return "2";//205处理爆红
            }//205处理爆红
        }else {//205处理爆红
            //当前用户不在
            return "1";//205处理爆红
        }//205

    }

    //controller层刷新验证码方法  ↓
    @RequestMapping("imgCode")
    @ResponseBody
    public String imgCode(HttpServletRequest request,HttpServletResponse response) throws Exception{
        return CheckImgUtil.checkImg(request, response);
    }


    //注册
    @RequestMapping("reg")/*111*/
    @ResponseBody
    public String reg(Suser suser){/*111*/
        Suser suserRet=suserService.querySuserByName(suser);//104处理爆红
        if(suserRet==null){
            //加密
            String suserpwd = suser.getSuserpwd();/*111*/
            String md516 = Md5Util.getMd516(suserpwd);/*111*/
            suser.setSuserpwd(md516);/*111*/
            suserService.reg(suser);/*111.处理爆红*/
            return "1";
        }else {
            return "2";
        }
    }

    @RequestMapping("toReg")
    public String toReg(){
        return "suser/reg";
    }

    @RequestMapping("calculation")
    public String calculation(Model model,HttpServletRequest request){
        Suser suser = (Suser) request.getSession().getAttribute("suser");
        Freightcalculation f=freightcalculationService.sel(suser);
        model.addAttribute("f",f);
        return "suser/calculation.html";
    }


    @RequestMapping("upf")
    @ResponseBody
    public void upf(Freightcalculation freightcalculation){
        freightcalculationService.upf(freightcalculation);
    }

}
package com.qst.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qst.bean.Customer;
import com.qst.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class SystemController {

    @Autowired
    public CustomerService customerService;

    @RequestMapping("/list")
    @ResponseBody //返回json数据，而不是跳转界面，改变返回方式
    public List<Customer> list(){
        List<Customer> list = customerService.findAll();
        return list;
    }

   Map<String,Object> result = new HashMap<String,Object>();

    /*分页查询*/
    @RequestMapping("/listByPage")
    @ResponseBody //返回json数据，而不是跳转界面，改变返回方式
    public Map<String,Object> listByPage(Integer page,Integer rows){
        //设置分页参数
        PageHelper.startPage(page,rows);
        //查询所有数据
        List<Customer> list = customerService.findAll();

        //用pageinfo来封装查询结果
        PageInfo<Customer> pageInfo =new PageInfo<Customer>(list);

        //后台需要返回total数和当前页的数据列表
        long total = pageInfo.getTotal();
        List<Customer> custList = pageInfo.getList();

        result.put("total",total);
        result.put("rows",custList);

        return result;
    }


    @RequestMapping("/save")
    @ResponseBody
    public  Map<String,Object> save(Customer customer){
        try {
            customerService.save(customer);
            result.put("success",true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success",false);
            result.put("msg",e.getMessage());
        }
        return result;
    }


/*
* 修改数据的数据回显方法
* */
    @RequestMapping("/findById")
    @ResponseBody
    public  Customer findById(Integer id){
        Customer customer =  customerService.findById(id);
        return customer;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public  Map<String,Object> delete(Integer[] id){
        try {
            customerService.delete(id);
            result.put("success",true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success",false);
            result.put("msg",e.getMessage());
        }
        return result;
    }

}

package com.bjsxt.controller;

import com.bjsxt.pojo.Product;
import com.bjsxt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.PrimitiveIterator;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping("getProduct")
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    //删除
    @ResponseBody
    @RequestMapping("delProduct")
    public int delProduct(Integer id){
        return 1;
    }

    //购买
    @ResponseBody
    @RequestMapping("addProduct")
    public void addProduct(Integer id){
        productService.addProduct(id);
    }

//    //购买
//    @ResponseBody
//    @RequestMapping("addOder")
//    public void addOrder(Double price){
//        productService.addorder(price);
//    }



}

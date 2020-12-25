package com.bjsxt.service;

import com.bjsxt.pojo.Order;
import com.bjsxt.pojo.Product;

import java.util.List;

public interface ProductService {
    //查询
    List<Product> getProduct();

    //删除商品
    int delProduct(Integer id );


    //购买
    void addProduct(Integer id);

//    List<Order> addorder(Double price);


}

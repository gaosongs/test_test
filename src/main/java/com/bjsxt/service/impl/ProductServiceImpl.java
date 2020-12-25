package com.bjsxt.service.impl;

import com.bjsxt.mapper.ProductMapper;
import com.bjsxt.pojo.Order;
import com.bjsxt.pojo.Product;
import com.bjsxt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public int delProduct(Integer id) {
        return productMapper.delProduct(id);
    }


    @Override
    public void addProduct(Integer id) {
        productMapper.addProduct(id);
    }

//    @Override
//    public void add2Product(Integer id) {
//        productMapper.addProduct(id);
//    }

    @Override
    public List<Product> getProduct() {
        return productMapper.getProduct();
    }

//    @Override
//    public List<Order> addorder(Double price) {
//        return productMapper.addorder(price);
//    }
//
//

}

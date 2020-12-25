package com.bjsxt.mapper;

import com.bjsxt.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {
    @Select("select * from product")
    List<Product> getProduct();

    @Delete("delete from dept where id=#{id}")
    int delProduct(Integer id );



  //购买
    @Select("update product set num=num-1 where id=#{id}")
     void addProduct(@Param("id") Integer id);


    //INSERT INTO 表名称 VALUES (值1, 值2,....)
    //订单
    @Insert("Insert into order values(null, #{price})")
     void addorder(Double price);



}

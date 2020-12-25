package com.bjsxt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Insert;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Double price;
}

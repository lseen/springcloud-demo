package com.spring.dao;

import com.spring.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductDao {

    @Select("select * from product_")
    List<Product> listProducts();

}

package com.example.mvcmca.Controllers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodMapper021 {
    @Select("SELECT * FROM FOOD")
    Food021[] selectFoods();


    @Insert("INSERT INTO FOOD(name,price) VALUES(#{name},#{price})")
    int insertFood(Food021 food);
}

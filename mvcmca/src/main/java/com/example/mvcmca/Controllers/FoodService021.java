package com.example.mvcmca.Controllers;

import org.springframework.stereotype.Service;

@Service
public class FoodService021 {
    private FoodMapper021 foodMapper;

    public FoodService021(FoodMapper021 foodMapper) {
        this.foodMapper = foodMapper;
    }

    public Food021[] getFood() {
        Food021[] foods =foodMapper.selectFoods();
        return foods;
    }
    public int addFood(Food021 food){
        return foodMapper.insertFood(food);
    }
}

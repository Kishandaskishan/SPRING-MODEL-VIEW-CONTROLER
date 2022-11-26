package com.example.mvcmca.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MyWebPage021 {
    private FoodService021 foodService;

    public MyWebPage021(FoodService021 foodService) {
        this.foodService = foodService;
    }

    @RequestMapping("/home")
    public String myWebpage(){
        return "home";
    }
    @GetMapping("/model")
    public String getModel(Model model){
        model.addAttribute("message","This is coming from the Controller");
model.addAttribute("people", Arrays.asList(
        new Person021("A",20),
        new Person021("B",18),
        new Person021("C",25),
        new Person021("D",23)
));
        return "modelpage";
    }

    @GetMapping("/")
    public String getQueryMapping(@RequestParam(value = "name",
            defaultValue = "World",required = true)
                                  String name, Model model){
        model.addAttribute("name",name);
        return "home";

    }
    @GetMapping("/food")
    public String getFood(Model model, Food021 food){
        Food021[] foods=foodService.getFood();
        model.addAttribute("foods",foods);
        return "food";
    }

    @PostMapping("/food")
    public String addFood(Model model,Food021 food){

        if (food.getPrice()>1000){
            model.addAttribute("errorMessage",String.format("Could not add  %s, TOO EXPENSIVE!!!",food.getName()));
        }else if(foodService.addFood(food)<1){
            model.addAttribute("errorMessage",String.format("Could not add  %s",food.getName()));
        }else {
            model.addAttribute("successMessage", String.format("Successfully added   %s", food.getName()));
        }
        Food021[] foods=foodService.getFood();
        model.addAttribute("foods",foods);
        return "food";
    }
}

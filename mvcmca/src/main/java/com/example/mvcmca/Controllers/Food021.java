package com.example.mvcmca.Controllers;

public class Food021 {
    private Integer id;
    private String name;
    private Double price;

    public Food021(Integer id, String name, Double price) {
        this.id=id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

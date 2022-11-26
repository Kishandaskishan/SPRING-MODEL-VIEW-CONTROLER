package com.example.mvcmca.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category021 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe021> recipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe021> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe021> recipes) {
        this.recipes = recipes;
    }
}

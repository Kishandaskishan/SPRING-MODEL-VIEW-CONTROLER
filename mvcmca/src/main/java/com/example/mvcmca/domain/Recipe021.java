package com.example.mvcmca.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe021 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //private difficulty Difficulty

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes021 notes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "recipe")
    private Set<Ingredient021> ingredients;

    @Enumerated(value = EnumType.STRING)
    private Difficulty021 difficulty;

    @ManyToMany
    @JoinTable(name = "recipe_cata",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category021> categories;

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

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes021 getNotes() {
        return notes;
    }

    public void setNotes(Notes021 notes) {
        this.notes = notes;
    }

    public Set<Ingredient021> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient021> ingredients) {
        this.ingredients = ingredients;
    }

    public Difficulty021 getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty021 difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Category021> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category021> categories) {
        this.categories = categories;
    }
}

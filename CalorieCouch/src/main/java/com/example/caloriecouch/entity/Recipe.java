package com.example.caloriecouch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
    @ManyToOne
    @JoinColumn(name = "ingridient_id")
    private Ingredient ingredients;
}

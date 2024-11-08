package com.example.caloriecouch.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dishCategories")
public class DishCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Dish> dishes;
}

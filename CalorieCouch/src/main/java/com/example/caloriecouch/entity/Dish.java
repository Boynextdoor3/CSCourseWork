package com.example.caloriecouch.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String deskription;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private DishCategory category;
    @OneToMany(mappedBy = "dish")
    private List<Recipe> recipes;

}

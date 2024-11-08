package com.example.caloriecouch.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ingridients")
@Getter
@Setter
@ToString
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private double calories;

    @Column(name = "protein")
    private double protein;

    @Column(name = "fat")
    private double fat;

    @Column(name = "carbohydrate")
    private double carbohydrate;

    @ManyToOne
    @JoinColumn(name = "ingredient_type_id")
    private IngredientType type;

}

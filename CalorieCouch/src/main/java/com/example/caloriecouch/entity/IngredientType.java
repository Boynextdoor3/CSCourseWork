package com.example.caloriecouch.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "ingredientTypes")
@Getter
@Setter
@ToString
public class IngredientType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "deskription")
    private String deskription;

    @OneToMany(mappedBy = "type")
    private List<Ingredient> ingridients;
}

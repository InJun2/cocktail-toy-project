package com.my.cocktail.cocktail.model.vo;


import jakarta.persistence.Embeddable;

@Embeddable
public class CocktailMaterial {
    private String name;
    private Long ratio;
}

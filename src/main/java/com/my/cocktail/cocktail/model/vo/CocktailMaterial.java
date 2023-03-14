package com.my.cocktail.cocktail.model.vo;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CocktailMaterial {
    private String name;
    private Long ratio;
}

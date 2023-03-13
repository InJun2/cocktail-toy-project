package com.my.cocktail.cocktail.model.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CocktailState {
    TASTE_PREVIOUS("시음 전"),
    TASTE_AFTER("시음 후");

    private final String description;
}

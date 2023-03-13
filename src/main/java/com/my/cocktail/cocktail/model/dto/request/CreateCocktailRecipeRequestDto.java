package com.my.cocktail.cocktail.model.dto.request;

import com.my.cocktail.cocktail.model.entity.CocktailRecipe;
import com.my.cocktail.cocktail.model.vo.CocktailMaterial;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCocktailRecipeRequestDto {
    @Positive
    Long memberId;

    @NotNull
    String cocktailName;

    @NotNull
    List<CocktailMaterial> cocktailMaterials;

    String cocktailDescription;

    Long degree;

    public CocktailRecipe toEntity() {
        return CocktailRecipe.builder()
                .memberId(this.memberId)
                .cocktailName(this.cocktailName)
                .cocktailMaterials(this.cocktailMaterials)
                .cocktailDescription(this.cocktailDescription)
                .degree(this.degree)
                .build();
    }
}
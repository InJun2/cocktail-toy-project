package com.my.cocktail.cocktail.model.dto.response;

import com.my.cocktail.cocktail.model.vo.CocktailMaterial;
import com.my.cocktail.cocktail.model.vo.CocktailState;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class CocktailResponseDto {
    private Long id;
    private Long memberId;
    private String cocktailName;
    private List<CocktailMaterial> cocktailMaterials;
    private String cocktailDescription;
    private Long degree;
    private CocktailState cocktailState;
    private Double cocktailStarPoint;
    private String comment;

    @Builder
    public CocktailResponseDto (Long id, Long memberId,
                                String cocktailName, List<CocktailMaterial> cocktailMaterials,
                                String cocktailDescription, Long degree, CocktailState cocktailState,
                                Double cocktailStarPoint, String comment) {
        this.id = id;
        this.memberId = memberId;
        this.cocktailName = cocktailName;
        this.cocktailMaterials = cocktailMaterials;
        this.cocktailDescription = cocktailDescription;
        this.degree = degree;
        this.cocktailState = cocktailState;
        this.cocktailStarPoint = cocktailStarPoint;
        this.comment = comment;
    }
}

package com.my.cocktail.cocktail.model.entity;

import com.my.cocktail.cocktail.model.dto.response.CocktailResponseDto;
import com.my.cocktail.cocktail.model.vo.CocktailMaterial;
import com.my.cocktail.cocktail.model.vo.CocktailState;
import com.my.cocktail.common.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CocktailRecipe extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "cocktail_name", nullable = false)
    private String cocktailName;

    @ElementCollection
    @CollectionTable(name="cocktail_materials",
            joinColumns = @JoinColumn(name= "cocktail_recipe_id"))
    private List<CocktailMaterial> cocktailMaterials = new ArrayList<>();

    @Column(name = "cocktail_description")
    private String cocktailDescription;

    @Column
    @Positive
    private Long degree;

    @Column
    @Enumerated
    private CocktailState cocktailState;

    @Column(name = "cocktail_star_point")
    @Max(5)
    @Positive
    private Double cocktailStarPoint;

    @Column
    private String comment;

    @Builder
    public CocktailRecipe(Long memberId, String cocktailName
            , List<CocktailMaterial> cocktailMaterials, String cocktailDescription, Long degree) {
        this.memberId = memberId;
        this.cocktailName = cocktailName;
        this.cocktailMaterials = cocktailMaterials;
        this.cocktailDescription = cocktailDescription;
        this.degree = degree;
        this.cocktailState = CocktailState.TASTE_PREVIOUS;
    }

    public CocktailResponseDto toCreateResponseDto() {
        return CocktailResponseDto.builder()
                .id(this.id)
                .memberId(this.memberId)
                .cocktailName(this.cocktailName)
                .cocktailMaterials(this.cocktailMaterials)
                .cocktailDescription(this.cocktailDescription)
                .degree(this.degree)
                .cocktailState(this.cocktailState)
                .build();
    }

    public CocktailResponseDto toResponseDto() {
        return CocktailResponseDto.builder()
                .id(this.id)
                .memberId(this.memberId)
                .cocktailName(this.cocktailName)
                .cocktailMaterials(this.cocktailMaterials)
                .cocktailDescription(this.cocktailDescription)
                .degree(this.degree)
                .cocktailState(this.cocktailState)
                .cocktailStarPoint(this.cocktailStarPoint)
                .comment(this.comment)
                .build();
    }
}

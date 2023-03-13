package com.my.cocktail.cocktail.service;

import com.my.cocktail.cocktail.model.dto.request.CreateCocktailRecipeRequestDto;
import com.my.cocktail.cocktail.model.dto.response.CocktailResponseDto;
import com.my.cocktail.cocktail.repository.CocktailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    public CocktailResponseDto createCocktailRecipe(CreateCocktailRecipeRequestDto requestDto) {
        var entity = cocktailRepository.save(requestDto.toEntity());

        return entity.toCreateResponseDto();
    }
}

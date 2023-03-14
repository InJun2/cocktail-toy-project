package com.my.cocktail.cocktail;

import com.my.cocktail.cocktail.model.dto.request.CreateCocktailRecipeRequestDto;
import com.my.cocktail.cocktail.model.vo.CocktailMaterial;
import com.my.cocktail.cocktail.repository.CocktailRepository;
import com.my.cocktail.cocktail.service.CocktailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CocktailTest {

    @Autowired
    private CocktailService cocktailService;

    @Autowired
    private CocktailRepository cocktailRepository;

    @Test
    public void 칵테일_생성_테스트() {
        List<CocktailMaterial> materials = new ArrayList<>();
        materials.add(new CocktailMaterial("잭 다니엘스", 1L));
        materials.add(new CocktailMaterial("콜라", 2L));

        CreateCocktailRecipeRequestDto request = new CreateCocktailRecipeRequestDto(1L, "testName", materials,  "content", 10L);
        cocktailService.createCocktailRecipe(request);

        var size = cocktailRepository.findAll().size();
        assertThat(size).isEqualTo(1);
    }
}

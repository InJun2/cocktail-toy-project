package com.my.cocktail.cocktail.controller;

import com.my.cocktail.cocktail.model.dto.request.CreateCocktailRecipeRequestDto;
import com.my.cocktail.cocktail.model.dto.response.CocktailResponseDto;
import com.my.cocktail.cocktail.service.CocktailService;
import com.my.cocktail.common.dto.ResponseDto;
import com.my.cocktail.common.dto.SwaggerNote;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/cocktail")
public class CocktailController {
    private final CocktailService cocktailService;

    @GetMapping
    @ApiOperation(value = "모든 상품 목록 조회", notes = SwaggerNote.ITEM_READ_ALL_NOTE)
    public void getAllItems() {
        System.out.println("Hello, World!");
    }

    @PostMapping
    @ApiOperation(value = "칵테일 생성", notes = SwaggerNote.COCKTAIL_CREATE_NOTE)
    public ResponseEntity<CocktailResponseDto> createCocktailRecipe(@RequestBody @Valid CreateCocktailRecipeRequestDto requestDto) {
        var responseDto = cocktailService.createCocktailRecipe(requestDto);

        return ResponseDto.created(responseDto);
    }
}

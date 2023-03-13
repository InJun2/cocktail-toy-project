package com.my.cocktail.cocktail.repository;

import com.my.cocktail.cocktail.model.entity.CocktailRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository extends JpaRepository<CocktailRecipe, Long> {
}

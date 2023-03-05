package com.my.cocktail.error.exception.example;

import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;
import lombok.Getter;

@Getter
public class LackOfPoint extends BusinessException {
    public LackOfPoint() {
        super(ErrorMessage.EXAMPLE_LACK_OF_POINT);
    }
}

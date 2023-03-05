package com.my.cocktail.error.exception.example;

import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;
import lombok.Getter;

@Getter
public class NotExistInformation extends BusinessException {
    public NotExistInformation() {
        super(ErrorMessage.EXAMPLE_NOT_EXIST_INFORMATION);
    }
}

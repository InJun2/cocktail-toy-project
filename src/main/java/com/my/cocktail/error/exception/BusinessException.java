package com.my.cocktail.error.exception;

import com.my.cocktail.error.dto.ErrorMessage;
import lombok.Getter;

@Getter
public abstract class BusinessException extends RuntimeException {
    private final ErrorMessage errorMessage;

    public BusinessException(ErrorMessage message) {
        super(message.getDescription());
        this.errorMessage = message;
    }
}
package com.my.cocktail.member.exception;


import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;

public class InvalidPinNumberException extends BusinessException {
    public InvalidPinNumberException() {
        super(ErrorMessage.INVALID_PIN_NUMBER_ERROR);
    }
}

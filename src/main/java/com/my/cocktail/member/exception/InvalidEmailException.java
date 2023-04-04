package com.my.cocktail.member.exception;


import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;

public class InvalidEmailException extends BusinessException {
    public InvalidEmailException() {
        super(ErrorMessage.INVALID_EMAIL_ERROR);
    }
}

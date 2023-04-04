package com.my.cocktail.member.exception;


import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;

public class InvalidPhoneNumberException extends BusinessException {
    public InvalidPhoneNumberException() {
        super(ErrorMessage.INVALID_PHONE_NUMBER_ERROR);
    }
}

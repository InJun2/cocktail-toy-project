package com.my.cocktail.member.exception;


import com.my.cocktail.error.dto.ErrorMessage;
import com.my.cocktail.error.exception.BusinessException;

public class BlankContentJoinException extends BusinessException {
    public BlankContentJoinException() {
        super(ErrorMessage.BLANK_CONTENT_JOIN_ERROR);
    }
}

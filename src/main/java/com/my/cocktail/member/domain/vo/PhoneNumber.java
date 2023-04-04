package com.my.cocktail.member.domain.vo;

import com.my.cocktail.member.exception.InvalidPhoneNumberException;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.Getter;

import java.util.regex.Pattern;

@Embeddable
@Getter
public class PhoneNumber {
    @Transient
    private static final String PHONE_REGEX = "^01(?:0|1|[6-9])+-(\\d{3}|\\d{4})+-(\\d{4})$";

    private String phoneNumber;

    protected PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = validate(phoneNumber);
    }

    private String validate(String phoneNumber) {
        if (Pattern.matches(PHONE_REGEX, phoneNumber)) {
            return phoneNumber;
        }
        throw new InvalidPhoneNumberException();
    }
}

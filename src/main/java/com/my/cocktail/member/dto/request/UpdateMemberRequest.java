package com.my.cocktail.member.dto.request;

import com.my.cocktail.member.domain.vo.PhoneNumber;
import com.my.cocktail.member.domain.vo.PinNumber;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateMemberRequest {
    private PhoneNumber phoneNumber;

    private PinNumber pin;

    @NotBlank
    String password;

    public UpdateMemberRequest(String phoneNumber, String pin, String password) {
        this.phoneNumber = new PhoneNumber(phoneNumber);
        this.pin = new PinNumber(pin);
        this.password = password;
    }
}

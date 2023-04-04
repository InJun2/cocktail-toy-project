package com.my.cocktail.member.dto.request;

import com.my.cocktail.member.domain.Member;
import com.my.cocktail.member.domain.vo.PhoneNumber;
import com.my.cocktail.member.domain.vo.PinNumber;
import com.my.cocktail.member.domain.vo.Email;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateMemberRequest {

    @NotBlank
    private String name;

    private PhoneNumber phoneNumber;

    private Email email;

    @NotBlank
    private String password;

    private PinNumber pin;

    public CreateMemberRequest(String name, String phoneNumber, String email, String password, String pin) {
        this.name = name;
        this.phoneNumber = new PhoneNumber(phoneNumber);
        this.email = new Email(email);
        this.password = password;
        this.pin = new PinNumber(pin);
    }


    public Member toEntity() {
        return Member.builder()
                .name(this.name)
                .phoneNumber(this.phoneNumber)
                .email(this.email)
                .password(this.password)
                .pin(this.pin)
                .build();
    }
}

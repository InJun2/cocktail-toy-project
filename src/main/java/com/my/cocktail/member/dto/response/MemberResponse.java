package com.my.cocktail.member.dto.response;

import com.my.cocktail.member.domain.vo.Email;
import com.my.cocktail.member.domain.vo.PhoneNumber;
import com.my.cocktail.member.domain.vo.PinNumber;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberResponse {

    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private String pin;
    private Long point;

    @Builder
    public MemberResponse (Long id, String name,
                           PhoneNumber phoneNumber, Email email,
                           String password, PinNumber pin, Long point) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber.getPhoneNumber();
        this.email = email.getEmail();
        this.password = password;
        this.pin = pin.getPinNumber();
        this.point = point;
    }
}

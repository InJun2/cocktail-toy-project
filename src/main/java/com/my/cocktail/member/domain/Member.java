package com.my.cocktail.member.domain;


import com.my.cocktail.common.entity.BaseEntity;
import com.my.cocktail.member.domain.vo.Email;
import com.my.cocktail.member.domain.vo.MemberState;
import com.my.cocktail.member.domain.vo.PhoneNumber;
import com.my.cocktail.member.domain.vo.PinNumber;
import com.my.cocktail.member.dto.request.UpdateMemberRequest;
import com.my.cocktail.member.dto.response.MemberResponse;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(indexes = {
        @Index(name="member_index", columnList = "id")
})
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @Embedded
    private PhoneNumber phoneNumber;

    @Column
    @Embedded
    private Email email;

    @Column
    private String password;

    @Column
    @Embedded
    private PinNumber pin;

    @Column
    private Long point;

    @Column
    @Enumerated
    private MemberState state;

    @Builder
    public Member(String name, PhoneNumber phoneNumber, Email email
            , String password, PinNumber pin) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.pin = pin;
        this.point = 3000L;
        this.state = MemberState.ACTIVE;
    }

    public MemberResponse toResponseDto() {
        return MemberResponse.builder()
                .id(this.id)
                .name(this.name)
                .phoneNumber(this.phoneNumber)
                .email(email)
                .password(this.password)
                .pin(this.pin)
                .point(this.point)
                .build();
    }

    public void withdrawMember() {
        this.state = MemberState.INACTIVE;
    }

    public void updateMember(UpdateMemberRequest request) {
        this.phoneNumber = request.getPhoneNumber();
        this.pin = request.getPin();
        this.password = request.getPassword();
    }
}

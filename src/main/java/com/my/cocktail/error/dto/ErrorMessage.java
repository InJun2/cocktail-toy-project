package com.my.cocktail.error.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage {
    EXAMPLE_NOT_EXIST_INFORMATION(HttpStatus.NOT_FOUND, "예제 exception : 존재하지 않는 정보입니다"),
    EXAMPLE_LACK_OF_POINT(HttpStatus.BAD_REQUEST, "예제 exception : 남아있는 포인트가 부족합니다"),
    BLANK_CONTENT_JOIN_ERROR(HttpStatus.BAD_REQUEST, "회원가입 특정 항목의 정보가 비어있습니다."),
    INVALID_EMAIL_ERROR(HttpStatus.BAD_REQUEST, "잘못된 이메일 정보입니다."),
    INVALID_PHONE_NUMBER_ERROR(HttpStatus.BAD_REQUEST, "잘못된 핸드폰 번호입니다"),
    INVALID_PIN_NUMBER_ERROR(HttpStatus.BAD_REQUEST, "잘못된 핀번호 입니다"),
    DUPLICATE_EMAIL_ERROR(HttpStatus.BAD_REQUEST, "중복된 이메일 입니다.");

    private final HttpStatus status;
    private final String description;
}

package com.my.project.error.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage {
    EXAMPLE_NOT_EXIST_INFORMATION(HttpStatus.NOT_FOUND, "예제 exception : 존재하지 않는 정보입니다"),
    EXAMPLE_LACK_OF_POINT(HttpStatus.BAD_REQUEST, "예제 exception : 남아있는 포인트가 부족합니다");

    private final HttpStatus status;
    private final String description;
}

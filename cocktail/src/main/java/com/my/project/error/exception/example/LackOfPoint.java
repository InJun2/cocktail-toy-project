package com.my.project.error.exception.example;

import com.my.project.error.dto.ErrorMessage;
import com.my.project.error.exception.BusinessException;
import lombok.Getter;

@Getter
public class LackOfPoint extends BusinessException {
    public LackOfPoint() {
        super(ErrorMessage.EXAMPLE_LACK_OF_POINT);
    }
}

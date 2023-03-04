package com.my.project.error.exception.example;

import com.my.project.error.dto.ErrorMessage;
import com.my.project.error.exception.BusinessException;
import lombok.Getter;

@Getter
public class NotExistInformation extends BusinessException {
    public NotExistInformation() {
        super(ErrorMessage.EXAMPLE_NOT_EXIST_INFORMATION);
    }
}

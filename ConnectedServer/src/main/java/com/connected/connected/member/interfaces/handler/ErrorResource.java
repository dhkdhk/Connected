package com.connected.connected.member.interfaces.handler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Getter @NoArgsConstructor
public class ErrorResource {

    private List<ErrorInformation> errorResources = new ArrayList<>();

    public ErrorResource(Errors errors) {
        addErrors(errors);
    }

    private void addErrors(Errors errors) {
        setErrorInformation(errors.getFieldErrors());
    }

    private void setErrorInformation(List<FieldError> fieldErrorList) {
        for(FieldError fieldError : fieldErrorList) {
            ErrorInformation errorInformation = ErrorInformation.builder()
                    .objectName(fieldError.getObjectName())
                    .fieldName(fieldError.getField())
                    .rejectedValue((String) fieldError.getRejectedValue())
                    .build();
            errorResources.add(errorInformation);
        }
    }


}

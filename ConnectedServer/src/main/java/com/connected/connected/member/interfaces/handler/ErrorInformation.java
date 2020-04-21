package com.connected.connected.member.interfaces.handler;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorInformation {
    private String objectName;
    private String fieldName;
    private String rejectedValue;
    private String errorCode;
    private String errorMessage;
}
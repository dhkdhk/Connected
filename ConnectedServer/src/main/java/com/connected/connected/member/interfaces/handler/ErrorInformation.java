package com.connected.connected.member.interfaces.handler;

import lombok.*;

@Builder @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorInformation {
    private String objectName;
    private String fieldName;
    private String rejectedValue;
    private String defaultMessage;
}
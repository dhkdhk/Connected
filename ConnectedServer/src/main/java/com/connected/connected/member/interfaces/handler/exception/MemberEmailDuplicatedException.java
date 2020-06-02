package com.connected.connected.member.interfaces.handler.exception;

public class MemberEmailDuplicatedException extends RuntimeException {

    private static final String MESSAGE = " 해당 이메일은 이미 사용중입니다.";

    public MemberEmailDuplicatedException(String message){
        super(message + MESSAGE);
    }
}

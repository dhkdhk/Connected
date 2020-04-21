package com.connected.connected.member.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Account {

    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private String tokenType;

}
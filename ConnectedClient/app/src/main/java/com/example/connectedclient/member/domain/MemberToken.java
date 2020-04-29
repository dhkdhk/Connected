package com.example.connectedclient.member.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberToken {

    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private String tokenType;

}

package com.connected.connected.member.domain.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Builder @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberToken {

    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private String tokenType;

}

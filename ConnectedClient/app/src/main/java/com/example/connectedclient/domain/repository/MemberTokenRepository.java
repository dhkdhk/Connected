package com.example.connectedclient.domain.repository;

import com.example.connectedclient.domain.MemberToken;

public interface MemberTokenRepository {
    MemberToken getToken(String clientId,  String clientSecret);
}

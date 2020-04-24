package com.example.connectedclient.domain.repository;

import com.example.connectedclient.domain.Member;

public interface MemberNetworkRepository {
    Member registerMember(Member member);
}

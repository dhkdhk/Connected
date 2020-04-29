package com.example.connectedclient.member.domain.repository;

import com.example.connectedclient.member.domain.Member;

public interface MemberNetworkRepository {
    Member registerMember(Member member);
}

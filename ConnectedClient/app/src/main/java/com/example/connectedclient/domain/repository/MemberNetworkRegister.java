package com.example.connectedclient.domain.repository;

import com.example.connectedclient.api.RegisterMemberApi;
import com.example.connectedclient.api.RegisterMemberApiProvider;
import com.example.connectedclient.domain.Member;

public class MemberNetworkRegister implements MemberNetworkRepository {

    private RegisterMemberApi api = RegisterMemberApiProvider.addMemberApi();

    @Override
    public Member registerMember(Member member) {

        return null;
    }
}

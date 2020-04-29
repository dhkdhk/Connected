package com.example.connectedclient.member.infrastructure;

import com.example.connectedclient.member.domain.api.NaverApi;
import com.example.connectedclient.member.domain.api.provider.NaverApiProvider;
import com.example.connectedclient.member.domain.Member;
import com.example.connectedclient.member.domain.repository.MemberNetworkRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemberRegister implements MemberNetworkRepository {


    @Override
    public Member registerMember(Member member) {

        return null;
    }


}

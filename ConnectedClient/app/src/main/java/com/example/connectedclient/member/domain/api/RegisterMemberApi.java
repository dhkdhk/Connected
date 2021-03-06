package com.example.connectedclient.member.domain.api;

import com.example.connectedclient.member.domain.Member;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegisterMemberApi {

    @POST("/members")
    Call<Member> addUser(@Body Member member);
}

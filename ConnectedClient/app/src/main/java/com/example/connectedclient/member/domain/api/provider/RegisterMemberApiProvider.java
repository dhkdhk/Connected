package com.example.connectedclient.member.domain.api.provider;

import com.example.connectedclient.member.domain.api.RegisterMemberApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class RegisterMemberApiProvider {

    private static final String addMemberUrl = "http://localhost:8080/";

    public static RegisterMemberApi addMemberApi(){
        return new Retrofit.Builder()
                .baseUrl(addMemberUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RegisterMemberApi.class);
    }
}

package com.example.connectedclient.api;

import com.example.connectedclient.domain.Member;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface NaverApi {

    @GET("https://openapi.naver.com/v1/nid/me")
    Call<Member> requestNaverInformation(@Header("Authorization") String token);
}

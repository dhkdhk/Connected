package com.example.connectedclient.member.infrastructure;

import com.example.connectedclient.member.domain.Member;
import com.example.connectedclient.member.domain.api.MemberGetterInformation;
import com.example.connectedclient.member.domain.api.NaverApi;
import com.example.connectedclient.member.domain.api.provider.NaverApiProvider;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemberNaverInformation implements MemberGetterInformation {

    private NaverApi naverApi = NaverApiProvider.requestInformation();
    private static final String TOKEN_PREFIX = "Bearer ";

    @Override
    public void requestInformation(String accessToken) {
        Call<Member> response = naverApi.requestNaverInformation(TOKEN_PREFIX+accessToken);
        response.enqueue(new Callback<Member>() {
            @Override
            public void onResponse(Call<Member> call, Response<Member> response) {
                if(response.isSuccessful()){
                    System.out.println(response.body()) ;
                    Member member = response.body();
                    System.out.println(member.toString());
                }
            }

            @Override
            public void onFailure(Call<Member> call, Throwable t) {
                System.out.println(t);
            }
        });
    }
}

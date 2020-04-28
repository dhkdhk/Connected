package com.example.connectedclient.domain.repository;

import com.example.connectedclient.api.NaverApi;
import com.example.connectedclient.api.NaverApiProvider;
import com.example.connectedclient.api.RegisterMemberApi;
import com.example.connectedclient.api.RegisterMemberApiProvider;
import com.example.connectedclient.domain.Member;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemberNetworkRegister implements MemberNetworkRepository {

    private RegisterMemberApi api = RegisterMemberApiProvider.addMemberApi();
    private NaverApi naverApi = NaverApiProvider.requestInformation();
    private static final String TOKEN_PREFIX = "Bearer ";

    @Override
    public Member registerMember(Member member) {

        return null;
    }

    @Override
    public void requestNaverInformation(String accessToken) {
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

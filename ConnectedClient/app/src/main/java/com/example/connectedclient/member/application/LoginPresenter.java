package com.example.connectedclient.member.application;

import android.content.Context;

import com.example.connectedclient.member.domain.Member;
import com.example.connectedclient.member.domain.api.MemberGetterInformation;
import com.example.connectedclient.member.infrastructure.NaverGetterOauthToken;
import com.example.connectedclient.member.interfaces.login.LoginConstract;

public class LoginPresenter implements LoginConstract.Presenter {


    private LoginConstract.View view;
    private MemberGetterInformation memberGetterInformation;

    private NaverGetterOauthToken naverGetterOauthToken;
    private Context mContext;


    public LoginPresenter(MemberGetterInformation memberGetterInformation, LoginConstract.View view, Context context){
        this.view = view;
        this.memberGetterInformation = memberGetterInformation;
        this.mContext = context;
    }

    @Override
    public void registerMember(Member member) {
    }

    @Override
    public void requestNaverInformation(String accessToken){
        memberGetterInformation.requestInformation(accessToken);
    }

    @Override
    public boolean naverLogin() {
        naverGetterOauthToken = new NaverGetterOauthToken(mContext, this);
        naverGetterOauthToken.forceLogin();
        return false;
    }

}

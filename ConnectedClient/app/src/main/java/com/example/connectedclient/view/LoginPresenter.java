package com.example.connectedclient.view;

import android.content.Context;

import com.example.connectedclient.domain.Member;
import com.example.connectedclient.domain.repository.MemberNetworkRepository;

public class LoginPresenter implements LoginConstract.Presenter {


    private LoginConstract.View view;
    private MemberNetworkRepository memberNetworkRepository;

    private NaverLogin naverLogin;
    private Context mContext;


    public LoginPresenter(MemberNetworkRepository networkRepository, LoginConstract.View view, Context context){
        this.view = view;
        this.memberNetworkRepository = networkRepository;
        this.mContext = context;
    }

    @Override
    public void registerMember(Member member) {
    }

    @Override
    public void requestNaverInformation(String accessToken){
        memberNetworkRepository.requestNaverInformation(accessToken);
    }

    @Override
    public boolean naverLogin() {
        naverLogin = new NaverLogin(mContext, this);
        naverLogin.forceLogin();
        return false;
    }

}

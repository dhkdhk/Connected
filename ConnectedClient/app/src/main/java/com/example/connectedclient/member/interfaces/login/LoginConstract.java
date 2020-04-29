package com.example.connectedclient.member.interfaces.login;

import com.example.connectedclient.member.domain.Member;

public interface LoginConstract {

    interface View {
        void registerSuccess();
        void loginProcess();
    }

    interface Presenter {
        void requestNaverInformation(String accessToken);
        void registerMember(Member member);
        boolean naverLogin();
    }


}

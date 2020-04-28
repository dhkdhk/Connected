package com.example.connectedclient.view;

import com.example.connectedclient.domain.Member;

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

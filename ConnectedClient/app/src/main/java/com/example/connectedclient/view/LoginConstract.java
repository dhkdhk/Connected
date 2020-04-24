package com.example.connectedclient.view;

import com.example.connectedclient.domain.Member;

public interface LoginConstract {

    interface View {
        void registerSuccess();
    }

    interface Presenter {
        void registerMember(Member member);
    }


}

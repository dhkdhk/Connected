package com.example.connectedclient.view;

import com.example.connectedclient.domain.Member;
import com.example.connectedclient.domain.MemberToken;
import com.example.connectedclient.domain.repository.MemberNetworkRepository;
import com.example.connectedclient.domain.repository.MemberTokenRepository;

public class LoginPresenter implements LoginConstract.Presenter {

    private MemberTokenRepository memberTokenRepository;
    private MemberNetworkRepository memberNetworkRepository;

    private final static String OAUTH_CLIENT_ID = "zNnDnGH5ecP2js8Mk84q";
    private final static String OAUTH_CLIENT_SECRET = "hioeQdFLhG";

    public LoginPresenter(MemberTokenRepository tokenRepository, MemberNetworkRepository networkRepository){
        this.memberTokenRepository = tokenRepository;
        this.memberNetworkRepository = networkRepository;
    }

    @Override
    public void registerMember(Member member) {
       MemberToken token = memberTokenRepository.getToken(OAUTH_CLIENT_ID, OAUTH_CLIENT_SECRET);
       member.setMemberToken(token);
       memberNetworkRepository.registerMember(member);
    }
}

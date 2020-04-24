package com.example.connectedclient.domain.repository;

import android.content.Context;

import com.example.connectedclient.domain.MemberToken;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;

public class MemberTokenSDKRepository implements MemberTokenRepository{

    private OAuthLogin mOAuthLoginInstance;
    private Context mContext;

    public MemberTokenSDKRepository(Context context){
        mOAuthLoginInstance = OAuthLogin.getInstance();
        mOAuthLoginInstance.showDevelopersLog(true);
        this.mContext = context;
    }

    @Override
    public MemberToken getToken(final String clientId, final String clientSecret) {
        mOAuthLoginInstance.init(mContext, clientId, clientSecret, "Connected");
        OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
            @Override
            public void run(boolean success) {
                if (success) {
                    MemberToken token = MemberToken.builder()
                            .accessToken(mOAuthLoginInstance.getAccessToken(mContext))
                            .refreshToken(mOAuthLoginInstance.getRefreshToken(mContext))
                            .expiredAt(mOAuthLoginInstance.getExpiresAt(mContext))
                            .tokenType(mOAuthLoginInstance.getTokenType(mContext))
                            .build();
                } else {
                    String errorCode = mOAuthLoginInstance.getLastErrorCode(mContext).getCode();
                    String errorDesc = mOAuthLoginInstance.getLastErrorDesc(mContext);
                }
            }

        };
        return null;
    }
}

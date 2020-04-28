package com.example.connectedclient.view;

import android.app.Activity;
import android.content.Context;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.data.OAuthErrorCode;

public class NaverLogin {

    private OAuthLogin mOAuthLoginInstance;
    private Context mContext;

    private static final String OAUTH_CLIENT_ID = "zNnDnGH5ecP2js8Mk84q";
    private static final String OAUTH_CLIENT_SECRET = "hioeQdFLhG";
    private static final String OAUTH_CLIENT_NAME = "Connected";

    private LoginConstract.Presenter presenter;

    public NaverLogin(Context mContext, LoginConstract.Presenter presenter) {
        this.presenter = presenter;
        this.mContext = mContext;
        initNaverAuthInstance();
    }

    private void initNaverAuthInstance() {
        mOAuthLoginInstance = OAuthLogin.getInstance();
        mOAuthLoginInstance.init(mContext, OAUTH_CLIENT_ID, OAUTH_CLIENT_SECRET, OAUTH_CLIENT_NAME);
    }

    public void forceLogin() {
        mOAuthLoginInstance.startOauthLoginActivity((Activity) mContext, mOAuthLoginHandler);
    }

    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
        @Override
        public void run(boolean success) {
            if(success) {
                  presenter.requestNaverInformation(mOAuthLoginInstance.getAccessToken(mContext));
            } else {
                OAuthErrorCode errorCode = mOAuthLoginInstance.getLastErrorCode(mContext);
            }
        }
    };
}

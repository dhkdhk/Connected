package com.example.connectedclient.view;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.connectedclient.R;
import com.example.connectedclient.domain.repository.MemberNetworkRegister;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

import static com.nhn.android.naverlogin.OAuthLogin.oauthLoginHandler;

public class LoginActivity extends AppCompatActivity implements LoginConstract.View, View.OnClickListener{

    private EditText phoneNumber;
    private LoginPresenter presenter;

    private OAuthLoginButton mOAuthOAuthLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        presenter = new LoginPresenter(new MemberNetworkRegister(), this, this);

        mOAuthOAuthLoginButton = findViewById(R.id.buttonOAuthLoginImg);
        mOAuthOAuthLoginButton.setOAuthLoginHandler(oauthLoginHandler);

        mOAuthOAuthLoginButton.setOnClickListener(this);

        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.addTextChangedListener(new PhoneNumberFormattingTextWatcher());



    }



    @Override
    public void registerSuccess() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void loginProcess() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonOAuthLoginImg:
                presenter.naverLogin();
        }
    }
}
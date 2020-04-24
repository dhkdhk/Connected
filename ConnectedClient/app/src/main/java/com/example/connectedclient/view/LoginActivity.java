package com.example.connectedclient.view;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.connectedclient.R;
import com.example.connectedclient.domain.repository.MemberTokenSDKRepository;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

import static com.nhn.android.naverlogin.OAuthLogin.oauthLoginHandler;

public class LoginActivity extends AppCompatActivity implements LoginConstract.View{

    private EditText phoneNumber;
    private LoginPresenter presenter;

    public static OAuthLoginButton mOAuthOAuthLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        presenter = new LoginPresenter(new MemberTokenSDKRepository(this));

        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        mOAuthOAuthLoginButton = findViewById(R.id.buttonOAuthLoginImg);
        mOAuthOAuthLoginButton.setOAuthLoginHandler(oauthLoginHandler);


    }

    @Override
    public void registerSuccess() {

    }
}
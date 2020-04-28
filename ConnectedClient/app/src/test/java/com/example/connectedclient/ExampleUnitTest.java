package com.example.connectedclient;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.EditText;

import com.example.connectedclient.domain.repository.MemberNetworkRegister;
import com.example.connectedclient.view.LoginActivity;
import com.example.connectedclient.view.LoginConstract;
import com.example.connectedclient.view.LoginPresenter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
@Config(sdk = Build.VERSION_CODES.P)
public class ExampleUnitTest {

    @Mock
    Context mockContext;

    private LoginConstract.Presenter presenter;
    @Test
    public void phoneNumberInitialize() {

    }
}
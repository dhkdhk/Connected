package com.example.connectedclient;

import android.content.Context;
import android.os.Build;

import com.example.connectedclient.member.interfaces.login.LoginConstract;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.robolectric.annotation.Config;

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
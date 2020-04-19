package com.example.connectedclient;

import android.app.Activity;
import android.os.Build;
import android.widget.EditText;

import com.example.connectedclient.ui.LoginActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.P)
public class ExampleUnitTest {
    @Test
    public void phoneNumberInitialize() {
        Activity activity = Robolectric.setupActivity(LoginActivity.class);
        EditText phoneNumber = activity.findViewById(R.id.phoneNumber);
        phoneNumber.setText("01077358811");

        assertEquals("010-7735-8811", phoneNumber.getText());
    }
}
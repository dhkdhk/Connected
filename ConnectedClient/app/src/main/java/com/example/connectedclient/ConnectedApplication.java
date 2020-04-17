package com.example.connectedclient;


import android.app.Application;

import com.example.connectedclient.di.ConnectedApplicationComponent;

public class ConnectedApplication extends Application {

    private ConnectedApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();


    }




    ConnectedApplicationComponent getComponent(){
        return component;
    }
}

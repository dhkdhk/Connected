package com.example.connectedclient;


import android.app.Application;

import com.example.connectedclient.di.ConnectedApplicationComponent;

import javax.inject.Inject;

public class ConnectedApplication extends Application {

    private ConnectedApplicationComponent component;

    @Inject
    public ConnectedApplication(ConnectedApplicationComponent component){
        this.component = component;
    }

    ConnectedApplicationComponent getComponent(){
        return component;
    }
}

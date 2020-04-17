package com.example.connectedclient.di;


import com.example.connectedclient.ConnectedApplication;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ConnectedApplicationComponent {
    ConnectedApplication injectApplication(ConnectedApplication application);
}

package com.example.dagger2again;

import android.app.Application;

import com.example.dagger2again.dagger.ActivityComponent;
import com.example.dagger2again.dagger.AppComponent;
import com.example.dagger2again.dagger.DaggerActivityComponent;
import com.example.dagger2again.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}

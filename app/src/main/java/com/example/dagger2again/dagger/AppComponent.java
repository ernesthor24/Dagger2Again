package com.example.dagger2again.dagger;

import com.example.dagger2again.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
    //Driver getDriver();
}

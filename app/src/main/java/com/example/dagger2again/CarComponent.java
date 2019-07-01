package com.example.dagger2again;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar(); //gets the car constructor

    void inject(MainActivity mainActivity); //injector field injection
}

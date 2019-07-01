package com.example.dagger2again.dagger;

import com.example.dagger2again.car.Car;
import com.example.dagger2again.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar(); //gets the car constructor

    void inject(MainActivity mainActivity); //injector field injection
}

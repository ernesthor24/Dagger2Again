package com.example.dagger2again;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = new Engine();
        this.wheels = new Wheels();
    }

    void drive() {
        Log.d(TAG, "Driving...");
    }
}

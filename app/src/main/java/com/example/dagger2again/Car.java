package com.example.dagger2again;

public class Car {

    Engine engine;
    Wheels wheels;

    Car() {
        engine = new Engine();
        wheels = new Wheels();
    }

    void drive() {

    }
}

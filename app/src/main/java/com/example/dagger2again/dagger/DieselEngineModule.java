package com.example.dagger2again.dagger;

import com.example.dagger2again.car.DieselEngine;
import com.example.dagger2again.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }

    /*
    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
    */
}
package com.example.dagger2again.dagger;

import com.example.dagger2again.car.DieselEngine;
import com.example.dagger2again.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract  class DieselEngineModule {


    @Binds
    abstract Engine bindEngine(DieselEngine engine);

    /*
    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
    */
}
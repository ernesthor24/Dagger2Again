package com.example.dagger2again.dagger;

import com.example.dagger2again.car.Engine;
import com.example.dagger2again.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract  class PetrolEngineModule {


    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    /*
    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
    */
}

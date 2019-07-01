package com.example.dagger2again.dagger;

import com.example.dagger2again.car.Rims;
import com.example.dagger2again.car.Tires;
import com.example.dagger2again.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){ //provides passes the return types so we can access rim andtires
        return new Wheels(rims, tires);
    }
}

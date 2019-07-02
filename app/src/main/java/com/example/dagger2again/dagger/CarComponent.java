package com.example.dagger2again.dagger;

import com.example.dagger2again.car.Car;
import com.example.dagger2again.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
//@Component (modules = {WheelsModule.class, DieselEngineModule.class})
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar(); //gets the car constructor

    void inject(MainActivity mainActivity); //injector field injection

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }
}

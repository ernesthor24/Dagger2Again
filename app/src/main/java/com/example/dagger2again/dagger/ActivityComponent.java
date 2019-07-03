package com.example.dagger2again.dagger;

import android.os.Build;

import com.example.dagger2again.car.Car;
import com.example.dagger2again.MainActivity;
import com.example.dagger2again.car.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

//@Singleton
@PerActivity
//@Component (modules = {WheelsModule.class, DieselEngineModule.class})
//@Component (dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar(); //gets the car constructor

    void inject(MainActivity mainActivity); //injector field injection

    /*@Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }*/
}

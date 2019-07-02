package com.example.dagger2again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2again.car.Car;
import com.example.dagger2again.dagger.CarComponent;
import com.example.dagger2again.dagger.DaggerCarComponent;
import com.example.dagger2again.dagger.DieselEngineModule;
import com.example.dagger2again.dagger.WheelsModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replaces the constructor
        CarComponent component1 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component1.inject(this);

        CarComponent component2 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component2.inject(this);

        //car = component.getCar(); //replaced by field injection



        component1.getCar().drive();
        component2.getCar().drive();

        /* used when single component
        car1.drive();
        car2.driver();
         */

    }
}

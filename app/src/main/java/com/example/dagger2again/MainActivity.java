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
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replaces the constructor
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);

        //car = component.getCar(); //replaced by field injection

        car.drive();

    }
}

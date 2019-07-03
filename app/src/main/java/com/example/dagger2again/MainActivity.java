package com.example.dagger2again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2again.car.Car;
import com.example.dagger2again.dagger.ActivityComponent;
import com.example.dagger2again.dagger.DaggerActivityComponent;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replaces the constructor
        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();
        component.inject(this);

        //car = component.getCar(); //replaced by field injection

        car1.drive();
        car2.drive();

    }
}

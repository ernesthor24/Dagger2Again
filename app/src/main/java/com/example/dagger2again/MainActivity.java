package com.example.dagger2again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replaces the constructor
        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();

        car.drive();

    }
}

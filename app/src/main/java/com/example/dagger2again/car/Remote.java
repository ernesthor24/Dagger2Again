package com.example.dagger2again.car;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote Connected");
    }

}

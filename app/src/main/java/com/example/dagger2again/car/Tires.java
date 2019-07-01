package com.example.dagger2again.car;

import android.util.Log;

public class Tires {
    //We don't own this for example so we can't inject

    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }

}

package com.example.dagger2again.car;

public class Wheels {
    //We don't own this for example so we can't inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}

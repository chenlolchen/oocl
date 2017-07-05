package com.oocl.world;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Penguin extends Bird implements SwimInterface{
    public void feather() {
        System.out.println("Penguin feather");
    }

    public void swim() {
        System.out.println("Penguin can Swimming");
    }

    public void metabolism() {
        System.out.println("Penguin Metabolism");
    }
}

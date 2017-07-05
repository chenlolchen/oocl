package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class SunFlower extends Flower {
    @Override
    public void price() {
        System.out.println("SunFlower cost 50 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("SunFlower durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("SunFlower coolDownTime is 7.5 second");
    }

    @Override
    public void collectEnergy() {
        System.out.println("SunFlower can collectEnergy");
    }
}

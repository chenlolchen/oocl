package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class SeaShroom extends Shroom implements SwimInterface, SleepInterface, AttackInterface {
    public void hasMushroomCap() {
        System.out.println("SeaShroom has MushroomCap");
    }

    public void swim() {
        System.out.println("SeaShroom can Swimming");
    }

    @Override
    public void price() {
        System.out.println("SeaShroom price is 0 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("SeaShroom durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("SeaShroom coolDownTime is 7.5 second");
    }

    public void sleep() {
        System.out.println("SeaShroom will sleep in the Morning");
    }

    public void attack() {
        System.out.println("Peashooter attack is 20");
    }

    public void attackInterval() {
        System.out.println("Peashooter attackInterval is 1.4 second");
    }

    public void attackRange() {
        System.out.println("Peashooter attack is 正前方3格");
    }
}

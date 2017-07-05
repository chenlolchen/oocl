package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class ScaredyShroom extends Plant implements DiggingInterface,SleepInterface {
    public void sleep() {
        System.out.println("ScaredyShroom will sleep in the Morning");
    }

    @Override
    public void price() {
        System.out.println("ScaredyShroom price is 25 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("ScaredyShroom durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("ScaredyShroom coolDownTime is 7.5 second");
    }

    public void attack() {
        System.out.println("ScaredyShroom attack is 20");
    }

    public void attackInterval() {
        System.out.println("ScaredyShroom attackInterval is 1.4 second");
    }

    public void attackRange() {
        System.out.println("ScaredyShroom attack is 正前方一整行");
    }

    public void digging() {
        System.out.println("ScaredyShroom can digging");
    }
}

package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class PuffShroom extends Plant implements SleepInterface,AttackInterface {
    public void sleep() {
        System.out.println("PuffShroom will sleep in the Morning");
    }

    @Override
    public void price() {
        System.out.println("PuffShroom price is 0 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("PuffShroom durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("PuffShroom coolDownTime is 7.5 second");
    }

    public void attack() {
        System.out.println("PuffShroom attack is 20");
    }

    public void attackInterval() {
        System.out.println("PuffShroom attackInterval is 1.4 second");
    }

    public void attackRange() {
        System.out.println("PuffShroom attack is 正前方3格");
    }
}

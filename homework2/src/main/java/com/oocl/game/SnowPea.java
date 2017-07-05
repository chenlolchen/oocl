package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class SnowPea extends Plant implements AttackInterface,AttackSlowDownInterface {
    public void attack() {
        System.out.println("Peashooter attack is 20");
    }

    public void slowDown() {
        System.out.println("Peashooter can slowDown Zombie");
    }

    public void attackInterval() {
        System.out.println("Peashooter attackInterval is 1.4 second");
    }

    @Override
    public void price() {
        System.out.println("Peashooter cost 175 sunlight");
    }

    public void attackRange() {
        System.out.println("Peashooter attackRange is 正前方一整行");
    }

    @Override
    public void durable() {
        System.out.println("Peashooter durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("Peashooter coolDownTime is 7.5 second");
    }
}

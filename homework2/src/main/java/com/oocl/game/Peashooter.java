package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class Peashooter extends Pea implements AttackInterface{
    @Override
    public void price() {
        System.out.println("Peashooter cost 750 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("Peashooter durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("Peashooter coolDownTime is 7.5 second");
    }

    public void attack() {
        System.out.println("Peashooter attack is 20");
    }

    public void attackInterval() {
        System.out.println("Peashooter attackInterval is 1.4 second");
    }

    public void attackRange() {
        System.out.println("Peashooter attack is 正前方一整行");
    }

    public void shootPea() {
        System.out.println("Peashooter can shootPea");
    }
}

package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class BucketZombie extends Zombie implements HasHatInterface, WeaknessInterface {
    public void hasHat() {
        System.out.println("BucketZombie has a hat");
    }

    public void attackPower() {
        System.out.println("BucketZombie has a hat");
    }

    public void speed() {
        System.out.println("BucketZombie speed is 僵尸普遍速度");
    }

    public void strongness() {
        System.out.println("BucketZombie strongness is 1100 + 200 + 70");
    }

    public void weakness() {
        System.out.println("BucketZombie weakness is 磁力菇");
    }
}

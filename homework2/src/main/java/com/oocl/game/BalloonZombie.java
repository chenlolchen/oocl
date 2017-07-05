package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class BalloonZombie extends Zombie implements WeaknessInterface, FlyInterface {
    public void fly() {
        System.out.println("BalloonZombie can fly");
    }

    public void weakness() {
        System.out.println("BalloonZombie weakness is 仙人掌，三叶草，香蒲，灰烬武器");
    }

    public void speed() {
        System.out.println("BalloonZombie speed is 气球飞行时约2.5s每格；被击落后僵尸普遍速度");
    }

    public void strongness() {
        System.out.println("BalloonZombie strongness is 20 + 200 +70");
    }
}

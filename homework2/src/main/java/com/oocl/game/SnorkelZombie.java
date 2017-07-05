package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class SnorkelZombie extends Zombie implements SwimInterface {
    public void swim() {
        System.out.println("SnorkelZombie can Swimming");
    }

    public void speed() {
        System.out.println("SnorkelZombie speed is 约4s走完一格");
    }

    public void strongness() {
        System.out.println("SnorkelZombie strongness is 200 + 70");
    }
}

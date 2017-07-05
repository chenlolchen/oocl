package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class DiggerZombie extends Zombie implements DiggingInterface, WeaknessInterface {
    public void digging() {
        System.out.println("DiggerZombie can digging");
    }

    public void weakness() {
        System.out.println("DiggerZombie weekness is 裂夹射手，杨桃，香蒲，磁力菇，灰烬武器，土豆雷");
    }

    public void speed() {
        System.out.println("DiggerZombie speed is 挖地时约1.2s每格；出土后约7s走完一格");
    }

    public void strongness() {
        System.out.println("DiggerZombie strongness is 100 + 200 + 70");
    }
}

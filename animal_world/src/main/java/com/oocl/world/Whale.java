package com.oocl.world;

/**
 * 鲸鱼
 */
public class Whale extends Mammal implements SwimInterface {
    public void viviparity() {
        System.out.println("Whale is viviparity");
    }

    public void swim() {
        System.out.println("Whale can Swim");
    }

    public void metabolism() {
        System.out.println("Whale Metabolism");
    }
}

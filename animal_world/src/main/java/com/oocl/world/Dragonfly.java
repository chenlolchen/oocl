package com.oocl.world;

/**
 * 蜻蜓
 */
public class Dragonfly extends Insect implements FlyInterface {
    public void noSkeleton() {
        System.out.println("Dragonfly is noSkeleton Animal");
    }

    public void fly() {
        System.out.println("Dragonfly can fly");
    }

    public void metabolism() {
        System.out.println("Dragonfly Metabolism");
    }
}

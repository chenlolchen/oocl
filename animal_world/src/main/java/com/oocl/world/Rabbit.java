package com.oocl.world;

/**
 * 兔子
 */
public class Rabbit extends Mammal implements RunInterface, CanHuntInterface{
    public void metabolism() {
        System.out.println("Rabbit Metabolism");
    }

    public void viviparity() {
        System.out.println("Rabbit viviparity");
    }

    public void run() {
        System.out.println("Rabbit can Run");
    }

    public void canHunt() {
        System.out.println("Rabbit can Hunt");
    }
}

package com.oocl.world;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Tiger extends Mammal implements RunInterface{
    public void viviparity() {
        System.out.println("Tiger is viviparity");
    }

    public void run() {
        System.out.println("Tiger can Run");
    }

    public void metabolism() {
        System.out.println("Tiger Metabolism");
    }
}

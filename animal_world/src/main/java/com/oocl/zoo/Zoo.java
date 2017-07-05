package com.oocl.zoo;

import com.oocl.world.Mammal;

public class Zoo<T extends Mammal> {
    private T[] ts;
    private int max = 100;
    private int size = 0;

    public Zoo(){
        ts = (T[])(new Mammal[max]);
    }

    public void add(T t){
        ts[size++] = t;
    }

    public T get(int index){
        return ts[index];
    }

}

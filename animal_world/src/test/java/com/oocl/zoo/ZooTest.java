package com.oocl.zoo;

import com.oocl.world.Mammal;
import com.oocl.world.Tiger;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class ZooTest {

    @Test
    public void add() throws Exception {
        Zoo<Mammal> zoo = new Zoo<Mammal>();
        zoo.add(new Tiger());
        Mammal temp = zoo.get(0);
        temp.metabolism();
    }

    @Test
    public void get() throws Exception {

    }

}
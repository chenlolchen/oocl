package com.oocl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CHENCO7 on 7/4/2017.
 */
public class MyMathTest {

    private static MyMath myMath;

    @BeforeClass
    public static void init(){
        myMath = new MyMath();
    }

    @Test
    public void sum() throws Exception {
        Assert.assertEquals(myMath.sum(1,4),5);
    }

}
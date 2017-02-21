package com.alina1234.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by agr on 2/9/2017.
 */
public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyTestFailed() {
        int a = 1, b = 2, expRes = 5;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }
}

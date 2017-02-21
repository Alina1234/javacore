package com.alina1234.app.homework.lesson3;

import com.alina1234.app.classwork.lesson3.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by agr on 2/19/2017.
 */
public class HomeworkMathTest {
    @Test
    public void multiplyNegativeTest(){
        int a = -1; int b = -5; int expRes = 5;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyZeroTest() {
        int a = 0; int b = 5; int expRes = 0;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void maxValueTest() {
        int a = 1; int b = 100; int expRes = 100;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void maxPositiveNegativeValueTest() {
        int a = 150; int b = -100000; int expRes = 150;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void maxNegativeValueTest() {
        int a = -4; int b = -1; int expRes = -1;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void minValueTest() {
        int a = 1; int b = 154; int expRes = 1;
        Assert.assertEquals(expRes, Math.min(a, b));
    }

    @Test
    public void minNegativeNumbersTest () {
        int a = -15; int b = -55; int expRes = -55;
        Assert.assertEquals(expRes, Math.min(a, b));
    }

    @Test
    public void raisedToPowerTest() {
        double a = 2; double b = 3; double expRes = 8.0; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.pow(a, b), DELTA);
    }

    @Test
    public  void raisedToZeroPowerTest() {
        double a = 100500; double b = 0; double expRes = 1; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.pow(a, b), DELTA);
    }
    @Test
    public void minNegativeAndPositive() {
        int a = -55; int b = 1; int expRes = -55;
        Assert.assertEquals(expRes, Math.min(a, b));
    }

    @Test
    public void sqrtValueTest() {
        double a = 9; double expRes = 3; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.sqrt(a), DELTA);
    }

    @Test
    public void absoluteValueTest() {
        int a = 5; int expRes = 5;
        Assert.assertEquals(expRes,Math.abs(a));
    }

    @Test
    public void absoluteValueNegativeTest() {
        int a = -5; int expRes = 5;
        Assert.assertEquals(expRes, Math.abs(a));
    }

    @Test
    public void roundToLessVauleTest() {
        double a = 5.25; double expRes = 5; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.round(a), DELTA);
    }

    @Test
    public void roundNegativeToLessTest() {
        double a = -9.22; double expRes = -9; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.round(a), DELTA);
    }

    @Test
    public void roundMostValue() {
        double a = 44.99; double expRes = 45; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.round(a), DELTA);
    }

    @Test
    public void roundNegativeToMost() {
        double a = -44.59; double expRes = -45; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.round(a), DELTA);
    }

    @Test
    public void MaxDoubleValue() {
        double a = 1554515.33; double b = 545655.55; double expRes = 1554515.33; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.max(a, b), DELTA);
    }

    @Test
    public void MinDoubleTest() {
        double a = -54545.33; double b = -5445.33; double expRes = -54545.33; double DELTA = 1e-15;
        Assert.assertEquals(expRes, Math.min(a, b), DELTA);
    }

    @Test
    public void absoluteFloatTest() {
        float a = -445.22f; float expRes = 445.22f;
        Assert.assertEquals(expRes, Math.abs(a), 0.001);

    }
}
package com.alina1234.app.classwork.lesson4;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 3/15/2017.
 */

@RunWith(JUnitParamsRunner.class)
public class CircleAreaTest {

    CircleArea circleArea;

    @Before
    public void SetUp(){
        circleArea = new CircleArea();
    }

    @Test
    public void circleArea1Bigger(){
        int radius1 = 3;
        int radius2 = 2;
        Assert.assertEquals("Area 1 is bigger", circleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public  void circleArea2Bigger(){
        int radius1 = 15;
        int radius2 = 22;
        Assert.assertEquals("Area 2 is bigger", circleArea.calculateBigger(radius1, radius2));
    }

    @Test
    public void circleAreasSame() {
        int radius1 = 10;
        int radius2 = 10;
        Assert.assertEquals("Area 1 is the same area 2", circleArea.calculateBigger(radius1,radius2));
    }

    @Test
    public void cirleArea1BiggerFalse(){
        int radius1 = 15;
        int radius2 = 22;
        Assert.assertNotEquals("Area 1 is bigger", circleArea.calculateBigger(radius1,radius2));
    }

    @Test
    public void circleArea2BiggerFalse(){
        int radius1 = 100;
        int radius2 = 34;
        Assert.assertNotEquals("Area 2 is bigger", circleArea.calculateBigger(radius1,radius2));
    }

    @Test
    public void circleAreasSameFalse(){
        int radius1 = 55;
        int radius2 = 555;
        Assert.assertNotEquals("Area 1 is the same area2", circleArea.calculateBigger(radius1,radius2));
    }
}

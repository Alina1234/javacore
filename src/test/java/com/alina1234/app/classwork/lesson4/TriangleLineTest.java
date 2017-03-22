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

public class TriangleLineTest {
    TriangleLine triangleLine;

    @Before
    public void setUp(){
        triangleLine = new TriangleLine();
    }

    @Test
    public void triangleLineTrue(){
        int line1 = 3;
        int line2 = 4;
        int line3 = 5;
        Assert.assertTrue(triangleLine.rightTriangle(line1, line2, line3));
    }

    @Test
    public void triangleLineFalse(){
        int line1 = 1;
        int line2 = 2;
        int line3 = 3;
        Assert.assertFalse(triangleLine.rightTriangle(line1, line2, line3));
    }

    @Test
    public void triangleWrong(){
        int line1 = -3;
        int line2 = -4;
        int line3 = -5;
        Assert.assertFalse(triangleLine.rightTriangle(line1, line2, line3));
    }
}

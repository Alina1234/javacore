package com.alina1234.app.classwork.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 2/9/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {
    //create global variable
    MathFunc mathFunc;

    //create object of class (need for 100% test coverage
    @Before
    public void setUp(){
        mathFunc = new MathFunc();
    }

    @FileParameters("src/test/java/resourses/multiply_parameters.csv")
    @Test // JUnit framework annotation
    public void multiplyTest(int a, int b, int expRes, boolean isTrue) {
        Assert.assertEquals(isTrue, expRes == MathFunc.multiply(a,b));
    }

    @Test
    public void multiplyTestFailed() {
        int a = 1, b = 2, expRes = 5;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }
}

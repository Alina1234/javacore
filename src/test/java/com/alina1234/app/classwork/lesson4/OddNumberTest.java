package com.alina1234.app.classwork.lesson4;

import com.alina1234.app.classwork.lesson4.OddNumber;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 3/15/2017.
 */
@RunWith(JUnitParamsRunner.class)

public class OddNumberTest {
    OddNumber oddNumber;

    @Before
    public void setUp(){
        oddNumber = new OddNumber();
    }

    @Test
    public void isOddTrue(){
        int number = 1;
        Assert.assertTrue(oddNumber.isOdd(number));
    }

    @Test
    public void isOddFalse(){
        int number = 2;
        Assert.assertFalse(oddNumber.isOdd(number));
    }
}

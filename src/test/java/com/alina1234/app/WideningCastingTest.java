package com.alina1234.app;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)

public class WideningCastingTest {
    WideningCasting wideningCasting;

    @Before
    public void setUp(){
        wideningCasting = new WideningCasting();
    }

    @Test
    public void wideningCastingTrue(){
        Assert.assertTrue(Double.class.isInstance(wideningCasting.widening()));
    }
}

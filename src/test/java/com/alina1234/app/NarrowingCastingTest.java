package com.alina1234.app;

import com.alina1234.app.NarrowingCasting;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)

public class NarrowingCastingTest {
    NarrowingCasting narrowingCasting;

    @Before
    public void SetUp(){
        narrowingCasting = new NarrowingCasting();
    }

    @Test
    public void FloatToIntNarrowingCasting(){
        float a = 12f;
        Assert.assertEquals(narrowingCasting.narrowing(a), 12);
    }
}

package com.alina1234.app.utils;

import com.alina1234.app.utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by agr on 3/21/2017.
 */
public class PrimitiveConvertorTest {
    PrimitiveConvertor primitiveConvertor;

    @Before
    public void setUp(){
        primitiveConvertor = new PrimitiveConvertor();
    }

    @Test
    public void floatToCharTest(){
        float a = 56f;
        //According ASCII table 56 DEC is equal symbol 8
        Assert.assertEquals(primitiveConvertor.floatToChar(a), '8');
    }

    @Test
    public void intToCharTest(){
        int a = 115;
        //Accroding ASCII table 115 DEC is equal symbol 's'
        Assert.assertEquals(primitiveConvertor.intToChar(a), 's');
    }

    @Test
    public void charToIntTest(){
        char a = '8';
        Assert.assertEquals(primitiveConvertor.charToInt(a),56);
    }
}

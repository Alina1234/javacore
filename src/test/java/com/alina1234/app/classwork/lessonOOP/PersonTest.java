package com.alina1234.app.classwork.lessonOOP;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by agr on 6/12/2017.
 */
@RunWith(JUnitParamsRunner.class)

public class PersonTest {
    Person person;

    @Before
    public void setUp(){
        person = new Person();
    }

    @Test
    public void getResponseNotEmpty(){
        String question = "test";
        Assert.assertEquals("My answer is test",person.getResponse(question));
    }
    
    @Test
    public void getResponseEmpty(){
        String question = new String();
        Assert.assertEquals("My answer is ",person.getResponse(question));
    }


}

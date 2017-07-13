package com.alina1234.app.homework.lesson12;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by agr on 7/11/2017.
 */
public class WhiteCollarTest {

    WhiteCollar whiteCollar;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
        whiteCollar = new WhiteCollar("Alina", 27, "Ciklum");
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void setCompanyIsOk(){
        Assert.assertNotNull(whiteCollar);
    }

    @Test
    public void CompanyNameIsNotOk(){
        System.setOut(null);
        ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent1));
        whiteCollar = new WhiteCollar("Sveta", 58, "Agency 777");
        Assert.assertEquals("New age setted\r\nCompany name is invalid\r\n", outContent1.toString());
    }
}

package com.alina1234.app.homework.lesson12;

import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by agr on 7/11/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class HumanTest {
    Human human;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        human = new Human("ira", 22);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void getNameIsOk(){
        Assert.assertNotNull(human.getName());
    }

    @Test
    public void getAgeisOk(){
        Assert.assertNotNull(human.getAge());
    }

    @Test
    public void setAgeIsOk(){
        Assert.assertEquals("New age setted\r\n", outContent.toString());
    }

    @Test
    public void setAgeNotOk(){

        //Clear output after setting there text
        System.setOut(null);

        //Create new variable
        ByteArrayOutputStream outContent1 = new ByteArrayOutputStream();

        //Create new value for output
        System.setOut(new PrintStream(outContent1));

        human = new Human("Nik", 125);

        Assert.assertEquals("Age invalid\r\n", outContent1.toString());
    }
}

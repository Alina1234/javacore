package com.alina1234.runners;

/**
 * Created by agr on 5/30/2017.
 */
public class Bycircle {
    public int whellSize;
    public String color;
    private Bycircle (int whellSize, String color){
        this.color = color;
        this.whellSize = whellSize;
    }
    private Bycircle (int whellSize){
        this();
        this.whellSize = whellSize;
    }
    public Bycircle (){
        this.color = "mint";
        this.whellSize = 26;
    }
    public String ride(){
        return "Wroom!";
    }
}

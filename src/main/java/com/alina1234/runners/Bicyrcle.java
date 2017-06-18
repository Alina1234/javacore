package com.alina1234.runners;

/**
 * Created by agr on 5/30/2017.
 */
public class Bicyrcle {
    private int whellSize;
    private String color;
    private int amountOfGears;
    private String breakType;
    public Bicyrcle() {
        this.whellSize = 20;
        this.color = "mint";
        this.amountOfGears = 18;
        this.breakType = "disk";
    }

    public Bicyrcle (String color){
        this(); //сетит дефолтный (он в коде выше)
        this.color = color; //дефолтному перезаписывает цвет
    }

    public Bicyrcle (String color, int whellSize){
        this(color); //засетило предидущий с цветом только, но с параметром цвет из этого конструктора
        this.whellSize = whellSize;
    }
}

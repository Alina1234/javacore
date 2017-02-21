package com.alina1234.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by agr on 2/16/2017.
 */
public class TriangleLine {
    public boolean rightTriangle(int line1, int line2, int line3) {


    if (line1 > 0 && line2 > 0 && line3 >0)
        return (line1 * line1 == line2 * line2 + line3 * line3)||(line2 * line2 == line1 * line1 + line3 * line3)||(line3 * line3 == line1 * line1 + line2 * line2);
    else return false;
}
}

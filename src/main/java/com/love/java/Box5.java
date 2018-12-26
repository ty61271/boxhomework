package com.love.java;

public class Box5 extends Box{
    float length = 39.5f;
    float width = 27.5f;
    float height = 23f;

    public Box5() {
        super.length = length;
        super.width = width;
        super.height = height;
    }

    @Override
    public void useBox() {
        System.out.println("use Box5");
    }
}

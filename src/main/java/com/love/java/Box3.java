package com.love.java;

public class Box3 extends Box {
    float length = 23f;
    float width = 14f;
    float height = 13f;

    public Box3() {
        super.length = length;
        super.width = width;
        super.height = height;
    }

    @Override
    public void useBox() {
        System.out.println("use Box3");
    }
}

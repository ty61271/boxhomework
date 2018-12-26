package com.love.java;


public abstract class Box {
    float length;
    float width;
    float height;

    public boolean validate(float length, float width, float height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }
    public abstract void useBox();
}

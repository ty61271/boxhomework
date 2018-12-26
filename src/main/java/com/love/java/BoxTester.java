package com.love.java;

import java.util.*;

public class BoxTester {
    public static void main(String[] args) {
        String[] position={"length","width","height"};
        List<Float> sizes=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        float size;
        for(int i=0;i<position.length;i++) {
            System.out.print("Please enter object's "+position[i]+":\t" );
            size=scanner.nextFloat();
            sizes.add(size);
        }
        checkBox(sizes);

    }

    private static void checkBox(List<Float> sizes) {
        if(new Box3().validate(sizes.get(0),sizes.get(1),sizes.get(2))){
            new Box3().useBox();
        }else if(new Box5().validate(sizes.get(0),sizes.get(1),sizes.get(2))){
            new Box5().useBox();
        }else {
            System.out.println("can put");
        }
    }
}

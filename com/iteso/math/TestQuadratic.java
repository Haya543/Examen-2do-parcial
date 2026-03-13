package com.iteso.math;

public class TestQuadratic {
    public static void main(String[] args) {
        Quadratic e1 = new Quadratic(3,5,2);
        Quadratic e2 = new Quadratic(2,6,3);

        e2.set(e1.a, e1.b, e1.c);

        if(e1.equals(e2)){
            System.out.println("Oh my Ghos! You guys are identical");
        }

        double d = e1.positiveX;
    }
}

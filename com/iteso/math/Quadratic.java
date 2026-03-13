package com.iteso.math;

import java.util.Objects;

public class Quadratic {
    public int a,b,c;
    public boolean hasSolution;
    public double positiveX, negativeX;

    //constructor
    public Quadratic(int a, int b, int c) {
        set(a,b,c);
    }

    public void set(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solve(hasSolution,positiveX,negativeX);
    }

    public void solve(boolean hasSolution, double positiveX, double negativeX) {
        double discriminant = Math.pow(b,2) - 4*a*c;
        if(discriminant < 0){
            hasSolution = false;
        } else {
            positiveX = (-b + Math.sqrt(discriminant)) / (2*a);
            negativeX = (-b - Math.sqrt(discriminant)) / (2*a);
        }

        this.hasSolution = hasSolution;
        this.positiveX = positiveX;
        this.negativeX = negativeX;
    }


    //getters
    public boolean isHasSolution() {
        return hasSolution;
    }

    public double getPositiveX() {
        return positiveX;
    }

    public double getNegativeX() {
        return negativeX;
    }


    @Override
    public String toString() {
        if (hasSolution) {
            System.out.printf("%d x^2 + %d x + %d = (%.2f, %.2f)", a, b, c, positiveX, negativeX);
        } else {
            System.out.printf("%d x^2 + %d x + %d = No real solution", a, b, c);
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quadratic quadratic = (Quadratic) o;
        return a == quadratic.a && b == quadratic.b && c == quadratic.c;
    }

}

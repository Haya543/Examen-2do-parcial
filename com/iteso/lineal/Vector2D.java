package com.iteso.lineal;

public class Vector2D {
    private double x,y;

    public Vector2D(double x, double y) {
        setComponentes(x,y);
    }

    private void setComponentes(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitud(){
        double magnitud = Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );
        return magnitud;
    }


    Vector2D sumar(Vector2D otro){
        otro = new Vector2D (this.x + otro.x, this.y + otro.x);
        return otro;

    }

    public double productoPunto(Vector2D otro){
        return (this.x * otro.x + this.y * otro.y);
    }

    Vector2D normalizar(Vector2D otro){
        otro = new Vector2D(this.x/this.getMagnitud(), this.y/this.getMagnitud());
        return otro;
    }

    @Override
    public String toString() {
        return "Vector(" +
                "x, " + x +
                "y)" + y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return Double.compare(x, vector2D.x) == 0;
    }
}

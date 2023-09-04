package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private Point  center;
    private double radius;
    private static final double PI = 3.14159265358979323846;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String pointsToString() {
        return onePointToString(center);
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }
}

package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double firstSide = side(a, b);
        double secondSide = side(a, c);
        double thirdSide = side(b, c);
        double halfPerimeter = (firstSide + secondSide + thirdSide)/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    @Override
    public String pointsToString() {
        return onePointToString(a) + onePointToString(b) + onePointToString(c);
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(a.getX(), Math.min(b.getX(), c.getX()));
        if(minX == a.getX()) {
            return new Point(minX, a.getY());
        } else if (minX == b.getX()) {
            return new Point(minX, b.getY());
        }
        return new Point(minX, c.getY());
    }

    /*
    Returns length of the side
     */
    public double side(Point first, Point second) {
        return Math.sqrt(Math.pow(second.getX() - first.getX(), 2) + Math.pow(second.getY() - first.getY(), 2));
    }
 }

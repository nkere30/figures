package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area() {
        return (new Triangle(a, b, d).area() + new Triangle(b, c, d).area());
    }

    @Override
    public String pointsToString() {
        return onePointToString(a) + onePointToString(b) + onePointToString(c) + onePointToString(d);
    }

    @Override
    public Point leftmostPoint() {
        double minX = Math.min(a.getX(), Math.min(b.getX(), Math.min(c.getX(), d.getX())));
        if(minX == a.getX()) {
            return new Point(minX, a.getY());
        } else if (minX == b.getX()) {
            return new Point(minX, b.getY());
        } else if (minX == c.getX()) {
            return new Point(minX, c.getY());
        }
        return new Point(minX, d.getX());
    }

    /*
    Returns length of the side
     */
    public double side(Point first, Point second) {
        return Math.sqrt(Math.pow(second.getX() - first.getX(), 2) + Math.pow(second.getY() - first.getY(), 2));
    }
}

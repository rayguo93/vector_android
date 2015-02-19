package com.practice.software.assignmentb;

public class Vector {

    private CartesianCoordinate cc;
    private PolarCoordinate pc;

    public Vector(CartesianCoordinate cc){
        this.cc = cc;
        this.pc = cc.toPolar();
    }

    public Vector(PolarCoordinate pc){
        this.pc = pc;
        this.cc = pc.toCartesian();
    }

    public static Vector add(Vector v1, Vector v2) {
        double x = v1.getCC().getX() + v2.getCC().getX();
        double y = v1.getCC().getY() + v2.getCC().getY();
        return new Vector(new CartesianCoordinate(x, y));
    }

    public static double dotProduct(Vector v1, Vector v2) {
        return v1.getCC().getX()*v2.getCC().getX() + v1.getCC().getY()*v2.getCC().getY();
    }

    public static double crossProduct(Vector v1, Vector v2) {
        return v1.getCC().getX()*v2.getCC().getY() - v1.getCC().getY()*v2.getCC().getX();
    }

    public CartesianCoordinate getCC() {
        return this.cc;
    }

    public PolarCoordinate getPC() {
        return this.pc;
    }

}

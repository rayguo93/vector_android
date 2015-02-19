package com.practice.software.assignmentb;

public class CartesianCoordinate {

    private double x;
    private double y;

    public CartesianCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PolarCoordinate toPolar() {
        double r = PrecisionUtility.round(Math.sqrt(this.x*this.x + this.y*this.y), PrecisionUtility.PRECISION);
        double theta = PrecisionUtility.round(Math.toDegrees(Math.atan2(this.y, this.x)), PrecisionUtility.PRECISION);
        return new PolarCoordinate(r, theta);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

}

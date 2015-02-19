package com.practice.software.assignmentb;

public class PolarCoordinate {

    private double r;
    private double theta; // in degrees

    public PolarCoordinate(double r, double theta) {
        this.r = r;
        this.theta = theta;
    }

    public CartesianCoordinate toCartesian() {
        double x = PrecisionUtility.round(this.r*Math.cos(Math.toRadians(theta)), PrecisionUtility.PRECISION);
        double y = PrecisionUtility.round(this.r*Math.sin(Math.toRadians(theta)), PrecisionUtility.PRECISION);
        return new CartesianCoordinate(x, y);
    }

    public double getR() {
        return this.r;
    }

    public double getTheta() {
        return this.theta;
    }

}
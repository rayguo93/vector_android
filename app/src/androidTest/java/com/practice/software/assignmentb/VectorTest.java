package com.practice.software.assignmentb;

import junit.framework.Assert;
import junit.framework.TestCase;

public class VectorTest extends TestCase {

    public void testAdd() {
        double x1 = 2;
        double y1 = 2;
        double x2 = -4;
        double y2 = -2;
        double xResult = x1 + x2;
        double yResult = y1 + y2;
        CartesianCoordinate cc1 = new CartesianCoordinate(x1, y1);
        CartesianCoordinate cc2 = new CartesianCoordinate(x2, y2);
        Vector v1 = new Vector(cc1);
        Vector v2 = new Vector(cc2);

        Vector result = Vector.add(v1, v2);

        Assert.assertEquals(xResult, result.getCC().getX());
        Assert.assertEquals(yResult, result.getCC().getY());
    }

    public void testDotProduct() {
        double x1 = 2;
        double y1 = 2;
        double x2 = -4;
        double y2 = -2;
        double expectedResult = x1*x2 + y1*y2;
        CartesianCoordinate cc1 = new CartesianCoordinate(x1, y1);
        CartesianCoordinate cc2 = new CartesianCoordinate(x2, y2);
        Vector v1 = new Vector(cc1);
        Vector v2 = new Vector(cc2);

        double actualResult = Vector.dotProduct(v1, v2);

        Assert.assertEquals(expectedResult, actualResult);
    }

    public void testCrossProduct() {
        double x1 = 2;
        double y1 = 2;
        double x2 = -4;
        double y2 = -2;
        double expectedResult = x1*y2 - x2*y1;
        CartesianCoordinate cc1 = new CartesianCoordinate(x1, y1);
        CartesianCoordinate cc2 = new CartesianCoordinate(x2, y2);
        Vector v1 = new Vector(cc1);
        Vector v2 = new Vector(cc2);

        double actualResult = Vector.crossProduct(v1, v2);

        Assert.assertEquals(expectedResult, actualResult);
    }

}


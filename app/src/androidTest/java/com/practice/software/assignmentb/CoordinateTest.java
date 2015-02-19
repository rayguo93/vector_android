package com.practice.software.assignmentb;

import junit.framework.TestCase;
import junit.framework.Assert;

public class CoordinateTest extends TestCase {

    public void testConvertCartesianToPolar() {
        double x = 1;
        double y = 1;
        double r = PrecisionUtility.round(Math.sqrt(2), PrecisionUtility.PRECISION);
        double theta = 45;

        PolarCoordinate cc = (PolarCoordinate) new CartesianCoordinate(x, y).toPolar();
        Assert.assertTrue(cc instanceof PolarCoordinate);
        Assert.assertEquals(r, cc.getR());
        Assert.assertEquals(theta, cc.getTheta());
    }

    public void testConvertPolarToCartesian() {
        double x = 1;
        double y = 1;
        double r = PrecisionUtility.round(Math.sqrt(2), PrecisionUtility.PRECISION);
        double theta = 45;

        CartesianCoordinate cc = new PolarCoordinate(r, theta).toCartesian();
        Assert.assertTrue(cc instanceof CartesianCoordinate);
        Assert.assertEquals(x, cc.getX());
        Assert.assertEquals(y, cc.getY());
    }
}

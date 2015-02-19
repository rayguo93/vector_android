package com.practice.software.assignmentb;


import junit.framework.Assert;
import junit.framework.TestCase;

public class UtilityTest extends TestCase {

    public void testRound() {
        double x = Math.PI;
        double xTwo = 3.14;
        double roundedX = PrecisionUtility.round(x, 2);
        Assert.assertEquals(xTwo, roundedX);
    }

}

/*
package com.practice.software.assignmentb;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

import junit.framework.Assert;

public class AndroidTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public AndroidTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception{
        super.setUp();
        mActivity = getActivity();
    }

    @MediumTest
    public void testCreateVector() {
        Assert.assertTrue(mActivity.createVector(0, 0) instanceof Vector);
    }

    @MediumTest
    public void testCreateVectorFields(){
        double x1 = 0;
        double y1 = 0;
        double x2 = 10;
        double y2 = 50;
        double x3 = 50;
        double y3 = -10;

        Vector v1 = mActivity.createVector(x1,y1);
        Vector v2 = mActivity.createVector(x2,y2);
        Vector v3 = mActivity.createVector(x3,y3);

        Assert.assertEquals(x1, v1.getX());
        Assert.assertEquals(y1, v1.getY());
        Assert.assertEquals(x2, v2.getX());
        Assert.assertEquals(y2, v2.getY());
        Assert.assertEquals(x3, v3.getX());
        Assert.assertEquals(y3, v3.getY());
    }



}
*/

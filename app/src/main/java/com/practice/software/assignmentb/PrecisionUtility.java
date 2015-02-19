package com.practice.software.assignmentb;

/**
 * Created by ricanare on 2015-02-19.
 */
public class PrecisionUtility {

  public static final double PRECISION = 2;

  public static double round(double value, double digits) {
        double multiplier = Math.pow(10, digits);
        return ((double) Math.round(value*multiplier))/multiplier;
  }

}

package com.bddinaction.chapter5.model;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 3:22 PM
 */
public class Trip {

    private final int distance;

    public Trip(int distance) {
        this.distance = distance;
    }

    public int getPoints() {
        return distance / 2;
    }
}

package com.bddinaction.chapter5.jbehave.model;

import com.bddinaction.chapter5.model.Trip;

public enum FrequentFlyerMember {

    Gold(10000), Silver(10001), Bronze(10002), Standard(10003);

    private FrequentFlyerMember(long membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public final long membershipNumber;

    public int getPointsFor(Trip trip) {
        return trip.getPoints();
    }
}

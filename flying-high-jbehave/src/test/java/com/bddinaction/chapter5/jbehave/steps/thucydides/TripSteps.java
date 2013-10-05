package com.bddinaction.chapter5.jbehave.steps.thucydides;

import com.bddinaction.chapter5.model.Trip;
import com.google.common.collect.Maps;
import net.thucydides.core.annotations.Step;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

import java.util.Map;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 3:29 PM
 */
public class TripSteps {

    private static Map<String, Trip> trips = Maps.newHashMap();

    @Step("Lookup trip from 0 to {1} leaving at {3} on {2}")
    public Trip lookupTrip(String departure, String destination, LocalTime time, DateTime date) {
        return trips.get(departure + ":" + destination);
    }

    public TripBuilder theDistanceBetween(String departure) {
        
        return new TripBuilder(departure);
    }
    
    public static class TripBuilder {
        private String departure;
        private String destination;

        public TripBuilder(String departure) {
            this.departure = departure;
        }

        public TripBuilder and(String destination) {
            this.destination = destination;
            return this;
        }

        public void is(int distance) {
            Trip trip = new Trip(distance);
            trips.put(departure + ":" + destination, trip);
        }
    }
}

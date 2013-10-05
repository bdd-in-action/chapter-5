package com.bddinaction.chapter5.jbehave.steps.thucydides;

public class TestDatabaseAPI {
    public DistanceBuilder theDistanceBetween(String departure) {
        return new DistanceBuilder(departure);
    }

    public class DistanceBuilder {
        private final String departure;
        private String destination;

        public DistanceBuilder(String departure) {
            this.departure = departure;
        }

        public DistanceBuilder and(String destination) {
            this.destination = destination;
            return this;
        }

        public void is(int distance) {
            // Add this record to the test database
        }
    }
}

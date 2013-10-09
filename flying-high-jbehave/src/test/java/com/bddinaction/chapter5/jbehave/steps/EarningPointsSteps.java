package com.bddinaction.chapter5.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class EarningPointsSteps {

    @Given("the flying distance between $departure and $destination is $distance km")
    @Pending
    public void defineTheFlyingDistanceForATrip(String departure,
                                                String destination,
                                                int distance) {
    }

    @Given("I am a $status Frequent Flyer member")
    @Pending
    public void defineAMemberWithStatus(String status) {
    }

    @When("I fly from $departure to $destination on $date at $time")
    public void whenIFlyFrom(String departure, String destination,
                             DateTime date, LocalTime time) {
    }

    @Then("I should earn $points points")
    public void thenIShouldEarn(int points) {
    }

    @Given("that I want to become a Frequent Flyer")
    @Pending
    public void givenThatIWantToBecomeAFrequentFlyer() {
    }

    @When("I register for the Frequent Flyer program")
    public void whenIRegisterForTheFrequentFlyerProgram() {
    }

    @Then("I should receive an email like this: $email")
    public void thenIShouldReceiveAnEmailLikeThis(String email) {
    }
    @Then("it should all work")
    public void itShouldAllWork() {}

    @Given("I am a $status member")
    @Pending
    public void statusIs(String status) {
    }

    @When("I fly on a flight that is worth <base> base points")
    public void flyFor(int base) {}

    @Then("I should earn a status bonus of $bonus")
    public void shouldEarnStatusBonus(int bonus) {}

    @Then("I should have guaranteed minimum earned points per trip of <minimum>")
    public void shouldHaveGuaranteedMinimum(int minimum) {}


    @Then("I should earn <total> points in all")
    public void shouldEarnTotalOf(int total) {}
}

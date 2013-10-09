package com.bddinaction.chapter5.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.List;
import java.util.Map;

/**
 * A description goes here.
 * User: john
 * Date: 31/07/13
 * Time: 5:36 PM
 */
public class TransferringPointsSteps {

    @Given("the following accounts: $accounts")
    @Pending
    public void givenTheFollowingAccounts(ExamplesTable accounts) {
        for(Map<String, String> account : accounts.getRows()) {
            String owner = account.get("owner");
            int points = Integer.parseInt(account.get("points"));
        }
    }

    @When("$from transfers $amount points to $to")
    public void transfer(String from, String to, int amount) {

    }

    @Then("the accounts should be the following: $accounts")
    public void theAccountsShouldBe(ExamplesTable accounts) {

    }
}

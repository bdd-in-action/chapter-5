package com.bddinaction.chapter5.cucumber.steps;

import com.bddinaction.chapter5.cucumber.model.Account;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

import java.util.List;

/**
 * A description goes here.
 * User: john
 * Date: 1/08/13
 * Time: 2:05 PM
 */
public class TransferSteps {

    @Given("I am a (.*) Frequent Flyer member")
    public void useAMemberWithAGivenStatus(String status) {
    }

    @Given("^(.*) is a Frequent Flyer member$")
    public void Joe_is_a_Frequent_Flyer_member(String member) throws Throwable {
    }

    @Given("^the following accounts:$")
    public void the_following_accounts(List<Account> accounts) throws Throwable {
    }

    @When("^(.*) transfers (\\d+) points to (.*)$")
    public void Joe_transfers_points_to_Jill(String from, int amount, String to) throws Throwable {
    }

    @Then("^the accounts should be the following:$")
    public void the_accounts_should_be_the_following(DataTable accounts) throws Throwable {
    }
}

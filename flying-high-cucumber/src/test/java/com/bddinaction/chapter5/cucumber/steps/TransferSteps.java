package com.bddinaction.chapter5.cucumber.steps;

import com.bddinaction.chapter5.cucumber.model.Account;
import com.google.common.collect.Lists;
import cucumber.api.DataTable;
import cucumber.api.Pending;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

import java.util.ArrayList;
import java.util.List;

/**
 * A description goes here.
 * User: john
 * Date: 1/08/13
 * Time: 2:05 PM
 */

public class TransferSteps {

    List<Account> accounts;
    String fromMember, toMember;

    @Given("I am a (.*) Frequent Flyer member")
    public void useAMemberWithAGivenStatus(String status) {
        throw new PendingException();
    }

    @Given("^(.*) is a Frequent Flyer member$")
    public void Joe_is_a_Frequent_Flyer_member(String member) throws Throwable {
    }

    public void the_following_accounts(List<Account> accounts) throws Throwable {
        this.accounts = accounts;
    }

    @When("^(.*) transfers (\\d+) points to (.*)$")
    public void transfer_points(String from, int amount, String to) throws Throwable {
        fromMember = from;
        toMember = to;
        // Perform transfer
    }

    @Then("^the accounts should be the following:$")
    public void the_accounts_should_be_the_following(DataTable expectedAccounts) throws Throwable {
        List<Account> actualAccounts = loadCurrentAccountsFor(fromMember, toMember);
        expectedAccounts.diff(actualAccounts);
    }

    private List<Account> loadCurrentAccountsFor(String fromMember, String toMember) {
        return Lists.newArrayList(new Account("Jill", 140000, 800), new Account("Joe",50000,50));
    }
}

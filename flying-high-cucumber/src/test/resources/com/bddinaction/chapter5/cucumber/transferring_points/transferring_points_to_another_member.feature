Feature: Transfer points to other members

  Background:
    Given Joe is a Frequent Flyer member
    And Jill is a Frequent Flyer member

  Scenario: Transfer points between existing members
    Given the following accounts:
      | owner | points | statusPoints  |
      | Jill  | 100,000 | 800           |
      | Joe   | 500,00  | 50            |
    When Joe transfers 40000 points to Jill
    Then the accounts should be the following:
      | owner | points | statusPoints   |
      | Jill  | 140,000 | 800            |
      | Joe   | 10,000  | 50             |

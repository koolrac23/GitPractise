
Feature: Customer Transaction 

Scenario: Deposit amount to his account

Given user logins with "Harry Potter" credentials
And user is in home page
When he deposits 500 to his account
Then Account balance should get updated





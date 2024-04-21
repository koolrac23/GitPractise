
Feature: Customer Transaction 

@Customer @Smoke
Scenario Outline: Deposit amount to his account

Given user logins with <name> credentials
And user is in home page
When he deposits <amount> to his account
Then Account balance should get updated

Examples:
|    name    |amount|
|Harry Potter| 500  |
|Ron Weasly  | 200  | 






Feature: BankManager Tansaction

@BankManager @Smoke
Scenario: Open Bank Account
Given I login to bank Manager credentials
When I click open Account
And fill customer name as "Harry Potter" and currency as "Dollar"
Then Account should be created successfully with Account number

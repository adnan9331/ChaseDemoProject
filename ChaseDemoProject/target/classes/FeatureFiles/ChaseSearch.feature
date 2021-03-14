@regression
Feature: Chase Search More

Scenario: Use Chase Search Feature
Given Open Chase website
When Click search icon
And Enter Home Loan
And Featured Link
Then Validate with loan options page
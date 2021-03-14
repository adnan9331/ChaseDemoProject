@regression
Feature: ATM & Branch Locator Function

Scenario Outline: Find specific atm & branch location
Given Open Chase website
When Click Site Map 
And Select ATM
And Enter "<Zip Code>"
And Select closest branch
Then Validate with ATM "<Languages>"

Examples:
| Zip Code | Languages |
| 11377    | Spanish   |
| 8989898  | None      |
| 000      | None      |
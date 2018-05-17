# new feature
# Tags: optional
    
Feature: Interest rate

Scenario: Interest rate
Given a customer has a new deposit for a period of 6 months with funds 100
And the deposit yearly interest rate is 10%
When a termination date has passed
Then 105 is transferred back to his account
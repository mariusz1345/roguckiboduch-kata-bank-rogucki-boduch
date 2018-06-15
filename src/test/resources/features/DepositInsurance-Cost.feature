# new feature
# Tags: optional
    
Feature: Deposit Insurance - Cost
    
Scenario: Given there is a customer who is about to open a new deposit of any kind
          And he decided to add the insurance to the deposit
          When he opens a deposit
          Then the deposited amount is 0.05% lower than the original amount
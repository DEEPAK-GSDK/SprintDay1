@magic
Feature: Home Loans on Magicbricks

Background:
Given User is on Home Page

@positive
Scenario: User calculates EMI,Eligibility,Prepayment
Given User clicks Home Loans section 
When selects Calculate EMI 
And User calculates EMI
And user selects Eligibility
And  User Calculates Eligibility
Then User Selects Prepayment Savings
And User Calculates Prepayment Savings

@positive1
Scenario: User applies for Home Loan Positive
Given User opens Home Loans section
And User Applies for Home Loan
When User applies for Loan against property
And User Applies for Balance Transfer
 
@negative
Scenario Outline: User applies for Home Loan Negative 
When the user clicks on "<check eligibility>" and "<mobile>"
Examples:
|check eligibility|mobile|
|280|77803361|
|50|939082|
|0|10|

 

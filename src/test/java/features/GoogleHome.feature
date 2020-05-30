#Author: sparimi
#Project: BDD Practice with Google home page
@web
Feature: Google Home Feature
  I want validate Google Home Feature

  Background: 
    Given background given step executed

  @smoke @regression
  Scenario: Google Home scenario1
    Given Scenario1 step01 executed
    Then Scenario1 step02 executed

  @regression
  Scenario: Google Home scenario2
    Given Scenario2 step01 executed
    Then Scenario2 step02 executed

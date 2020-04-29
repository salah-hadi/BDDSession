#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: creating new Departmnet

  @tag1
  Scenario: launch browser, login and open new department netity
    Given Chrome Browser
    And BarqStaging website
    When login
    And open departments entity
    And press "New" button
    Then new Department entity will be displayed 

  @tag2
  Scenario Outline: creating new record
    Given new Department screen
    When filling data
    And save
    Then record will be created

      

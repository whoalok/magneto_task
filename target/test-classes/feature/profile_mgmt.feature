@AccountManagment

Feature: User Account Management on Magento Website

  @MAG-TC-1 
  Scenario: Successful New Account Registration
    Given I am on the Magento home page
    When I navigate to the Create New Customer Account page
    And I fill in all required valid details
    And I click the Create an Account button
    Then I should see a success message
    And I should be logged in to my account and see my name

  
  @MAG-TC-2 
  Scenario: Successful Login with Valid Credentials
    Given I have an existing registered account
    When I navigate to the Sign In page
    And I enter valid registered Email and Password
    And I click the Sign In button
    Then I should be logged in to my account
    And I should see a welcome message with my name

  
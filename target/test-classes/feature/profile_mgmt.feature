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
  Scenario: Account Registration with Existing Email
    Given I am on the Magento home page
    When I navigate to the "Create New Customer Account" page
    And I fill in details with an already registered email
    And I click the "Create an Account" button
    Then I should see an error message indicating email already exists

	@MAG-TC-3
  Scenario: Account Registration with Mismatched Passwords
    Given I am on the Magento home page
    When I navigate to the "Create New Customer Account" page
    And I fill in details with mismatched Password and Confirm Password
    And I click the "Create an Account" button
    Then I should see an error message for password mismatch

	@MAG-TC-4
  Scenario: Account Registration with Invalid Email Format
    Given I am on the Magento home page
    When I navigate to the "Create New Customer Account" page
    And I fill in details with an invalid email format
    And I click the "Create an Account" button
    Then I should see an error message for invalid email format

  Scenario: Successful Login with Valid Credentials
    Given I have an existing registered account
    When I navigate to the "Sign In" page
    And I enter valid registered Email and Password
    And I click the "Sign In" button
    Then I should be logged in to my account
    And I should see a welcome message with my name

  Scenario: Login with Invalid Password
    Given I have an existing registered account
    When I navigate to the "Sign In" page
    And I enter a valid Email but an incorrect Password
    And I click the "Sign In" button
    Then I should see an error message for invalid credentials

  Scenario: Login with Unregistered Email
    Given I am on the Magento home page
    When I navigate to the "Sign In" page
    And I enter an unregistered Email and a password
    And I click the "Sign In" button
    Then I should see an error message for invalid credentials

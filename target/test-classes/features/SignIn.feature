Feature: Retail Signin Page

  @test
  Scenario: verify user logged in into retail website
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'John01@gmail.com' and password 'John123@'
    And User click on login button
    Then User should be logged in into Account

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email             | password  | confirmPassword |
      | manager | tekSupport@gmail.com | Tek@43421 | Tek@43421       |
    And User click on SignUp button
    Then User should be logged into account page

Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'John01@gmail.com' and password 'John123@'
    And User click on login button
    And User should be logged into Account
    Then User click on Account option

  @updateProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'Ray' and phone '401-301-1011'
    And User click on update button
    Then user profile information should be updated

  @AddPaymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1223567613121111 | Carlos     |              12 |           3028 |          371 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @EditPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    #And User select the card ending with '1111'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3312187994340000 | Smith      |              10 |           2035 |          301 |
    And user click on Update Your Card button

  @RemovePaymentMethod
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User select the card ending with '0000'
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress   | apt | city      | state      | zipCode |
      | United States | jay      | 717-888-9921 | 701 Laguna Blvd |  75 | Elk Grove | California |   95516 |
    And User click Add Your Address button
    Then A message should be display 'Address Added Successfully'

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below informations
      | country       | fullName | phoneNumber  | streetAddress     | apt | city      | state      | zipCode |
      | United States | John     | 916-878-1021 | 32 Elk grove blvd |  96 | Elk Grove | California |   26580 |
    And User click update Your Address button

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

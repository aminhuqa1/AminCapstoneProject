@AllCapstone
@TestAllRetailPage
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'newNamenewLast7@gmail.com' and password 'newNamenewLast'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @ChequePayment
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company   | website      | taxID       | paymentMethod | payee name |
      | TekSchool | tekschool.us | 12345654321 | Cheque        | TekSchool  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'

  @BankTransfer
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link
    And User click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode   | accountName | accountNumber |
      | US Bank  | 102000021 | USBKUS44IMT | Amin Amin   |    1021234565 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'

  @EditInfo
  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstname | lastName    | email                    | telephone  |
      | Alex      | AlexianZada | newNamenewLast8@gmail.com | 3031233218 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'

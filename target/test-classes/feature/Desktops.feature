@AllCapstone
@TestAllDesktops
Feature: Desktops

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops

  @DesktopsItemPresence
  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  @AddHP3065
  Scenario: User add HP LP3065 from Desktops tab to the cart
    And User click ADD TO CART option on HP LP3065 item
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message 'Success: You have added HP LP3065 to your shopping cart!'

  @AddCanon5D
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click ADD TO CART option on Canon EOS 5D item
    And User select color from dropdown 'Red'
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message 'Success: You have added Canon EOS 5D Camera to your shopping cart!'

  @AddReviewCanon5D
  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourName      | yourReview                                                                                 | Rating |
      | Amin Hussaini | I really like it. It is what I expected and needed. I hope it had all accessories with it. |      4 |
    And User click on Continue Button
    Then User should see a message 'Thank you for your review. It has been submitted to the webmaster for approval.'

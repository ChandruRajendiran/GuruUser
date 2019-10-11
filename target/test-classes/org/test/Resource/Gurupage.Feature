
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: User Navigate to the Guru page
    Given user is on Guru Telecom page
    When user enters all required filed in all the pages
    |Chandru|Rajendiran|Chandru@gmail.com|113,kamber st,kk nagar,chennai|8428330589|
    And user clicks submit
    Then user should see payment
   

  
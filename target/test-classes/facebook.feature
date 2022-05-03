#Author: your.email@your.domain.com
#Keywords Summary :

Feature: opening facebook

  Scenario: User opening facebook
    Given User was in faceboook login page.
    When User enters username  and password.
    |9043217338|Dinesh@1993|
    And User clicks login button
    Then Facebook page opens

   
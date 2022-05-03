#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Opening Amazon.in website

  Scenario Outline: Opening Amazon.in website and searching
    Given User was in amazon website
    When User enters product name "<search>" in search box
    Then Search results related to that product

    Examples: 
      | search  |
      | iphone 10 |
      | poco m14 pro 128gb |
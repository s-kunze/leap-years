Feature: Leap Year
  As a user, I want to know if a year is a leap year, 
  So that I can plan for an extra day on February 29th during those years.

  Scenario Outline: All years divisible by 400 ARE leap years
    Given A user
    When he wants to know if the year "<year>" is a leap year
    Then it must return "<result>"
    
  Examples:
    | year | result |
    | 2000 | true   |

  Scenario Outline: All years divisible by 100 but not by 400 are NOT leap years
    Given A user
    When he wants to know if the year "<year>" is a leap year
    Then it must return "<result>"
    
  Examples:
    | year | result |
    | 1700 | false  |
	| 1800 | false  |
	| 1900 | false  |
	| 2100 | false  |

  Scenario Outline: All years divisible by 4 but not by 100 ARE leap years
    Given A user
    When he wants to know if the year "<year>" is a leap year
    Then it must return "<result>"
    
  Examples:
    | year | result |
	| 2008 | true   |
	| 2012 | true   |
	| 2016 | true   |

  Scenario Outline: All years not divisible by 4 are NOT leap years
    Given A user
    When he wants to know if the year "<year>" is a leap year
    Then it must return "<result>"
    
  Examples:
    | year | result |
	| 2017 | false  |
	| 2018 | false  |
	| 2019 | false  |
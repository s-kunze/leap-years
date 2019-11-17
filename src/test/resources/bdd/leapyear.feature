Feature: As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.

  Scenario: As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.
    Given A user
    When he wants to know if the year "<year>" is a leap year
    Then it must return "<result>"
  Examples:
    | year | result |
    | 2000 | true   |
    | 1700 | false  |
	| 1800 | false  |
	| 1900 | false  |
	| 2100 | false  |
	| 2008 | true   |
	| 2012 | true   |
	| 2016 | true   |
	| 2017 | false  |
	| 2018 | false  |
	| 2019 | false  |
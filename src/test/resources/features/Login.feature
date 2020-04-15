@login
Feature: User should able to login

  Background:

  @wip
  Scenario:Login as CRM Manager
    Given Given the user is on the login page
    When the user enters "eventscrmmanager22@info.com" "eventscrmmanager"
    Then the user should able to login "Odoo"

  Scenario: Not able to login with invalid credentials
    When the user enters "evencrmmanager22@info.com" "evencrmmanager"
    Then the user should not able to login
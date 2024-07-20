Feature: As an admin I should be able to create a user and delete a user

  @wip
  Scenario Outline: create a user and delete a user
    Given The user is on the web page
    When The user navigates to login menu
    And The user enters admins credentials
    And The user enters "<name>" and "<salary>" and "<durationwork>" and "<grade>"> and "<email>"
    Then The user verifies that "<name>"is in employeelist
    And  The user deletes that "<name>"is in employeelist
    Then The user verifies that "<email>"  deleted in employeelist

    Examples:
      | name   | salary | durationwork | grade  | email             |
      | Hatice | 40000  | 4            | Middle | hatice@hotmail.de |
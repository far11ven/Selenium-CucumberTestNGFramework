@tag
Feature: Testing Login for Gmail

  @test1
  Scenario Outline: Checking G-mail login
    Given I launch website URL
    When I provide <username> and <password>
    Then I verify login is successful for <username>

    Examples: 
      | username        | password |
      | dummy@gmail.com | al       |
      | dummy@gmail.com | al       |

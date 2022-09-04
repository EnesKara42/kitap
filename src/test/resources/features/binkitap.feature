Feature: Login and publish something function
  As a user, I should be able to login and publish some book quotes

  @share
  Scenario Outline: Login Functionality
    Given user logged in
    When user publish
    Then user should login and publish something successfully "<kitap>" and "<quote>"

    Examples:
      | kitap | quote                                                                                                                        |
      | Aeden | Bu insanların tuhaf bir özelliği vardı ki, aralarından bazıları hissetmedikleri duyguları yansıtmanın sanki ustası olmuştu.. |
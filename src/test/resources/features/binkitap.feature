Feature: Login and publish something function
  As a user, I should be able to login and publish some book quotes

  @share
  Scenario Outline: Login Functionality
    Given user logged in
    When user publish
    Then user should login and publish something successfully "<kitap>" and "<quote>"

    Examples:
      | kitap             | quote                                                                                                           |
      | Dol Karabakır Dol | ... senin en karanlık göklerinde salkım salkım yıldızların var benim içimde insan ayağı değmemiş karanlıklar... |
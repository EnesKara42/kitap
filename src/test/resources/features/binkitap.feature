Feature: Login and publish something function
  As a user, I should be able to login and publish some book quotes

  @share
  Scenario Outline: Login Functionality
    Given user logged in
    When user publish
    Then user should login and publish something successfully "<kitap>" and "<quote>"

    Examples:
      | kitap      | quote                                                                                                                                                                                                                                                                                                                                                                |
      | kör baykuş | odamı sınırlayan dört duvar arasında, varlığımı ve düşüncelerimi kuşatan hisarın içinde ömrüm azar azar eriyor bir mum gibi, hayır, yanlışım var, ömrüm bir oduna benziyor, ocaktan düşen bir oduna: öteki odunların ateşinde kavrulmuş, kömürleşmiş, ama ne yanmış, ne olduğu gibi kalmış bir oduna benziyor. fakat diğerlerinin dumanından, soluğundan boğulmuş... |
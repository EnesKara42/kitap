Feature: Login and publish something function
  As a user, I should be able to login and publish some book quotes

  @share
  Scenario Outline: Login Functionality
    Given user logged in
    When user publish
    Then user should login and publish something successfully "<kitap>" and "<quote>"

    Examples:
      | kitap          | quote                                                                                                                                                                                  |
      | Cehenneme Övgü | İnsanın sevdiğine sahip olma tutkusu aşkın kendisinden ağır basmaya başladığı an, bu aşk değildir artık. Aşk yaşamdan güçlü olamaz, özgürlükten yoksun olarak da varlığını sürdüremez. |
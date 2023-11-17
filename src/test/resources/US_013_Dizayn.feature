@Dizayn

Feature: Dizayn

  Background: login_ol
    Given login to app

  @dizaynButton
  Scenario: Dizayn sayfasına git
    Given Online Magaza butonuna tıkla
    When Dizayn butonuna tıkla
    And  Dizayn etmek istediği sayfaya tıkla
    Then Dizayn sayfasında oldugunu dogrula

@Dizayn
Feature: Dizayn Page Verification Test

  Background: Login to Tija
    Given login to app

  @dizaynButton
  Scenario: Dizayn sayfasına git
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla
    Then Dizayn sayfasında oldugunu dogrula

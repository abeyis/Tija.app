@Sayfalar
Feature: Sayfalar

  Background: Login to Tija
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla

    @SayfalarMusteriHizmetleri
   Scenario: Verifying information at Customer Service
    Given Verify information with Customer Service
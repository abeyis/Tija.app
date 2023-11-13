@Dizayn
@wip
Feature: Dizayn


  Background: login_ol
    Given login to app

  @dizaynButton
  Scenario: Dizayn sayfasına git
    Given Kullanıcı Online Magaza butonuna tıklar
    When Kullanıcı Dizayn butonuna tıklar
    And  Kullanıcı dizayn etmek istediği sayfaya tıklar
    Then Kullanıcı Dizayn sayfasında oldugunu dogrular

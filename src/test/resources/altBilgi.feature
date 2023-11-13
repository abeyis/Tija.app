@wip
Feature: Alt Bilgi Bölümünün Ayarları

  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Kullanıcı Online Magaza butonuna tıklar
    When Kullanıcı Dizayn butonuna tıklar
    And  Kullanıcı dizayn etmek istediği sayfaya tıklar
    And Kullanıcı Dizayn sayfasında oldugunu dogrular
    Then Kullanıcı Alt Bilgi butonuna tıklar

  Scenario:MüşteriHizmetleri_bölümündeki_bilgileri_doğrula

    #Given Kullanıcı Müşteri Hizmetleri bölümündeki bilgileri doğrular

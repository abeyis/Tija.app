@wip
Feature: Alt Bilgi Bölümünün Ayarları

  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Online Magaza butonuna tıkla
    When Dizayn butonuna tıkla
    And  Dizayn etmek istediği sayfaya tıkla
    And Dizayn sayfasında oldugunu dogrula
    Then Alt Bilgi butonuna tıkla

  @AltBilgiTC01
  Scenario:Müşteri Hizmetleri bölümünü doğrula
    Given  Bilgileri doğrula

  @AltBilgiTC02
  Scenario: Hesabım bölümündeki Bilgilerim butonunun görünürlügünü dogrula
    Given Bilgilerim butonunu dogrula

  @AltBilgiTC03
  Scenario: Sosyal medya bölümündeki iconların görünürlügünü dogrula
    Given Sol üst köşedeki üç çizgiye tıkla
    When Ayarlar butonuna tıkla
    And Web Sitesi butonuna tıkla
    And Web sitesinin Düzenle butonuna tıkla
    And Sosyal Medya butonuna tıkla
    And Huawei AppGallery Link textine link gir
    And App Store Link textine link gire
    And Google Play Store Link textine link gir
    And ETBIS Link textine link gir
    And Twitter Link textine link gir
    And Facebook Link textine link gir
    And Instagram Link textine link gir
    And Youtube Link textine link gir
    And Kaydete tıkla
    And ikonlarının görüldüğünü doğrula

@wip

Feature: Alt Bilgi Bölümünün Ayarları

  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla
    Then Alt Bilgi butonuna tıkla

  @AltBilgiTC01
  Scenario:Müşteri Hizmetleri bölümünü doğrula
    Given  Bilgileri doğrula

  @AltBilgiTC02
  Scenario: Hesabım bölümündeki Bilgilerim butonunun görünürlügünü dogrula
    Given Bilgilerim butonunu dogrula

  @smoke
  @AltBilgiTC03
  Scenario: Sosyal medya bölümündeki iconların görünürlügünü dogrula
    Given Sol üst köşedeki üç çizgiye tıkla
    When Click the " Ayarlar " module button
    And Web Sitesi butonuna tıkla
    And "Web : abeyis-web" Düzenle butonuna tıkla
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

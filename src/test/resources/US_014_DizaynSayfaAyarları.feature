@DizaynSayfaAyarları
@wip
Feature: Dizayn Sayfa Ayarları

  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Online Magaza butonuna tıkla
    When Dizayn butonuna tıkla
    And  Dizayn etmek istediği sayfaya tıkla
    And Dizayn sayfasında oldugunu dogrula

  @TC01sayfaAyarları
  Scenario:Başlık butonuna tıklayıp sayfa ayarlarını gerçekleştir

    Given Başlık butonuna tıkla
    When Sayfa Ayarları butonuna tıkla
    And Başlık text box'ına valid bir değer gir
    And Sayfa genişliğini seç
    And Aktif butonuna tıkla
    And Kaydet butonuna tıkla
    And İşlem başarılı pop up ının görüldüğünü dogrula

  @TC02sayfaAyarları
  Scenario: Main butonuna tıklayıp sayfa ayarlarını gerçekleştir

    Given Main bölümünden bir görsel veya bir ürüne tıkla
    When Sayfa Ayarları butonuna tıkla
    And Başlık text box'ına valid bir değer gir
    And Sayfa genişliğini seç
    And Aktif butonuna tıkla
    And Kaydet butonuna tıkla
    And İşlem başarılı pop up ının görüldüğünü dogrula

  @TC03sayfaAyarları
  Scenario: Alt Bilgi butonuna tıklayıp sayfa ayarlarını gerçekleştir

    Given Alt Bilgi butonuna tıkla
    When Sayfa Ayarları butonuna tıkla
    And Başlık text box'ına valid bir değer gir
    And Sayfa genişliğini seç
    And Aktif butonuna tıkla
    And Kaydet butonuna tıkla
    And İşlem başarılı pop up ının görüldüğünü dogrula


  @TC04sayfaAyarları
  Scenario: Sayfa ayarlarından sayfanın kopyasını oluştur

    Given Sayfa Ayarları butonuna tıkla
    And Kopya oluştur butonuna tıkla
    Then Sayfanın kopyalandıgını dogrula


  @TC05sayfaAyarları
  Scenario: Sayfa ayarlarından oluşturulan sayfayı sil

    Given Sayfa Ayarları butonuna tıkla
    And Sayfayı sil butonuna tıkla
    And Sayfayı silmek istediğinize emin misiniz? sorusunu görüp evet butonuna tıkla
    Then Sayfanın silindigini dogrula


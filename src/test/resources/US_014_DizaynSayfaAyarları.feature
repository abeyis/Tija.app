@DizaynSayfaAyarları
@wip
@smoke
@regression
Feature: Dizayn Sayfa Ayarları

  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla

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
    Then Open Page List
    Then Sayfanın kopyalandıgını dogrula


  @TC05sayfaAyarları
  Scenario: Sayfa ayarlarından oluşturulan sayfayı sil

    Given Sayfa Ayarları butonuna tıkla
    And Sayfayı sil butonuna tıkla
    And Sayfayı silmek istediğinize emin misiniz? sorusunu görüp evet butonuna tıkla
    Then Open Page List
    Then Sayfanın silindigini dogrula


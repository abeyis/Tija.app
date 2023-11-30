@wip
@regression
@US_028
Feature: US_028 Ana Menu Duzenleme

#  Background: Her senaryo öncesi login işlemi gerçekleştir
  Scenario:
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    Then Select the website to work on
    Then Select "AbeyisTest" option from page list
    When Click the "Ana Menü" module button
    When Click the "Yeni" module button
    Then Send "Abeyis Ana Menü" text to "Menü İsmi"
    And Select Liste for Menu Tipi
    When Click the "Oluştur" button
    When Click the "Kaydet" button
    Then Verify that the "Abeyis Ana Menü" has been created


#
#
#
#
#
#
#Menü bilgilerini gir
#"Oluştur" butonuna tıkla
#"Kaydet" butonuna tıkla
#Menüler penceresini kapat
#Sayfa Ayarları için "Kaydet" butonuna tıkla
#Menünün oluşturulduğunu doğrula
#
#  Scenario: TC_001 Zorunlu alanlara bilgi girildiğinde kupon kaydı yapılabildiğini doğrula
#    And Enter test data to all required fields
#    And Click the "Kaydet" button
#    Then Verify that the kupon was saved
#
#  Scenario: TC_002 Zorunlu alanların tamamına bilgi girilmediğinde kuponun kaydedilemediğini doğrula
#    And Enter test data to some required fields
#    Then Verify that Kaydet button is not clickable
#
#  Scenario: TC_004 Kupon için özel koleksiyon seçimi yapılabildiğini doğrula
#    And Select Web:abeyis-web option from Web sitesi dropdown list
#    Then Click "Güncelle" button for "Kupon-ZorunluGirişler" in list
#    And Select "Özel Koleksiyona" option from "Uygulama Alanı" dropdown list
#    And Click the "Koleksiyon Seç" button
#    Then Select koleksiyon members on the pop-up window
#    And Click the "Seç" button
#    Then Verify that the selection is complete
#  @smok
#  Scenario: TC_011 Kaydedilen kuponların gerektiğinde silinebildini doğrula
#    And Select Web:abeyis-web option from Web sitesi dropdown list
#    Then Click "Sil" button for "Kupon-ZorunluGirişler" in list
#    And Click "Sil" confirmation button
#    Then Verify that the deletion is complete
@wip
@regression
@US_028
Feature: US_028 Ana Menu Duzenleme

  Background: Her senaryo oncesi login islemi ile dizayn sayfasi ana menu modulune erisim islemini gerceklestir
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    Then Select the website to work on
    Then Select "AbeyisTest" option from page list
    When Click the "Ana Menü" module button

  Scenario: TC_021 Menuler basligi altinda yeni ana menu olusturulabildigini dogrula
    When Click the "Yeni" module button
    Then Send "Abeyis Ana Menü" text to "Menü İsmi"
    And Select Liste for Menu Tipi
    When Click the "Oluştur" button
    When Click the "Kaydet" button
    And Close the Menuler Panel
    Then Verify that the "Abeyis Ana Menü" has been "created"

  Scenario: TC_022 Ana Menuye koleksiyon, marka, urun ve sayfalar icin yonlendirme menu ogeleri eklenebildigini dogrula
    Then Select "Abeyis Ana Menü" option from Ana Menu list
    When Click the "Düzenle" module button
    Then Click the "Menü Kırılımı" tab
    Then Create menu items for koleksiyon, urun, marka and sayfa
#           | Başlık     | Menu Item  | Yönlendirilen Sayfa     |
            | Koleksiyon | Koleksiyon | Smart Watch             |
            | Ürün       | Ürün       | Galaxy Buds Live        |
            | Marka      | Marka      | Samsung                 |
            | Mağazamız  | Sayfa      | Bilgi Güvenliği         |
    Then Click the "Menü Bilgileri" tab
    Then Click the "Kaydet" button
    Then Verify that the Islem basarili PupUp is displayed
    And Close the Menuler Panel
    Then Click the "Kaydet" Button
    Then Verify that the menu items have been created

  Scenario: TC_023 Ana Menuye link menu yonlendirme ogesi eklenebildigini dogrula
    Then Select "Abeyis Ana Menü" option from Ana Menu list
    When Click the "Düzenle" module button
    Then Click the "Menü Kırılımı" tab
    Then Click menu ogesi ekle icon
    Then Send title "Sayfamız" to Baslik
    Then Click the "Yönlendir" button in Menuler
    Then Select "Link" option as Item
    Then Send "https://www.glopark.com" as web address
    Then Click the Kaydet button
    Then Click the Olustur button
    Then Click the "Menü Bilgileri" tab
    Then Click the "Kaydet" button
    Then Verify that the Islem basarili PupUp is displayed
    And Close the Menuler Panel
    Then Click the "Kaydet" Button
    Then Verify that the link item "Sayfamız" has been created

  Scenario: TC_024 Ana Menude koleksiyon, marka, urun ve sayfalar icin mevcut yonlendirme menu ogelerinin degistirilebildiğini dogrula
    Then Select "Abeyis Ana Menü" option from Ana Menu list
    When Click the "Düzenle" module button
    Then Click the "Menü Kırılımı" tab
    Then Change menu items for koleksiyon, urun, marka and sayfa
#     | Başlık     | Yeni Başlık | Menu Item  | Yönlendirilen Sayfa  |
      | Koleksiyon | Seri Sonu   | Ürün       | Azur Ütü 7000 Serisi |
      | Ürün       | Sezonluk    | Koleksiyon | IOS Smart Phone      |
      | Marka      | Markalar    | Marka      | Apple                |
      | Mağazamız  | İletişim    | Sayfa      | Telefon              |

    Then Click the "Menü Bilgileri" tab
    Then Click the "Kaydet" button
    Then Verify that the Islem basarili PupUp is displayed
    And Close the Menuler Panel
    Then Click the "Kaydet" Button
    Then Verify that the menu items have been changed

  Scenario: TC_030 Ana Menunun gerektiginde silinebildigini dogrula
    Then Select "Abeyis Ana Menü" option from Ana Menu list
    When Click the "Düzenle" module button
    When Click the "Sil" button
    When Click the "Kaldır" button
    When Click the "Kaydet" button
    Then Verify that the "Abeyis Ana Menü" has been "deleted"


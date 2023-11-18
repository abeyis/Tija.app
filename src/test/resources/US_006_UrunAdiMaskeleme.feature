@regression
@US_006
@wip
Feature: US_006 Urun Adi Maskeleme

  Background: Her senaryo öncesi login işlemi gerçekleştir
    Given login to app

    Scenario: TC_012 Mevcut Urunler icin Maske Degeri Tanimlanabildigini Dogrula
      When Click the "Online Mağaza" module button
      When Click the "Ürün Adı Maskeleme" module button
      And Enter "Galaksi Bads Live" and "15" for "Galaxy Buds Live" to Mask fields
      And Click the "Ekle" button
      Then Verify that Urun Adi Maskeleme Data is recorded

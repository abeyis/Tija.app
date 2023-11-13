@smoke
@regression
@US_006

Feature: US_006 Urun Adi Maskeleme

  Background: Her senaryo öncesi login işlemi gerçekleştir
    Given login to app

  Scenario: TC_012 Mevcut Urunler icin Maske Degeri Tanimlanabildigini Dogrula
    Given Click the Online Magaza button
    When Click Urun Adi Maskeleme button
    And Enter "Galaksi Bads Live" and "15" for "Galaxy Buds Live" to Mask fields
    Then Click the "Ekle" button
    Then Verify that Urun Adi Maskeleme Data is recorded
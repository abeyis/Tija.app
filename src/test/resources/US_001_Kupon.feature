@smoke
@regression
@US_001

Feature: US_001 Kupon

  Background: Her senaryo öncesi login işlemi gerçekleştir
    Given login to app

    Scenario: TC_002 Zorunlu alanların tamamına bilgi girilmediğinde kuponun kaydedilemediğini doğrula
      Given Click the Online Magaza button
      When Click the Kupon button
      And Enter test data to some required fields
      Then Verify that Kaydet button is not clickable


    Scenario: TC_004 Kupon için özel koleksiyon seçimi yapılabildiğini doğrula
      Given Click the Online Magaza button
      When Click the Kupon button
      And Select Web:abeyis-web option from Web sitesi dropdown list
      Then Click "Güncelle" button for "Kupon-ZorunluGirişler" in list
      And Select "Özel Koleksiyona" option from Uygulama Alanı dropdown list
      And Click the "Koleksiyon Seç" button
      Then Select koleksiyon members on the pop-up window
      And Click the "Seç" button
      Then Verify that the selection is recorded

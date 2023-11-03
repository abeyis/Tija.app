@smoke
@regression
@US_001

Feature: US_001 Kupon

  Background: Her senaryo öncesi login işlemi gerçekleştir
    Given login to app

    Scenario: TC_002 Zorunlu alanların tamamına bilgi girilmediğinde kuponun kaydedilemediğini doğrula

      Given User click the Online Magaza button
      When User click the Kupon button
      And Enter test data to some required fields
      Then Verify that Kaydet button is not clickable

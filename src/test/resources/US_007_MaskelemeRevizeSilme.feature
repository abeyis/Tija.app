Feature: Urun Adi Maskeleme

  Background: Login to Tija
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Ürün Adı Maskeleme" module button


   Scenario: Update mask values
    Given Find mask value
    When Enter new test data
    When Click the Update button
    When Verify that the transaction successful pop up appears

    Scenario: Delete mask values
      Given Find mask value
      When Click on the delete button
      When Click the Yes button
      When Verify that the transaction successful pop up appears

      //div[@class='row m-0 py-4 pl-4 borderbtm ng-star-inserted']


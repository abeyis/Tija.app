@Maskeleme
Feature: Urun Adi Maskeleme

  Background: Login to Tija
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Ürün Adı Maskeleme" module button

@MaskelemeUpdate
   Scenario: Update mask values
    Given Enter new test data
    When Click the Update button
    When Verify that the transaction successful pop up appears

  @MaskelemeDelete
    Scenario: Delete mask values
      Given Click on the delete button
      When Click the Yes button
      When Verify that the transaction successful pop up appears




@regression
Feature: New price lists should be able to be added, deleted and updated for companies that are sub-company

    Background:
       * login to app
        * Click the "Online Mağaza" module button
        * Click the "Fiyat Listesi" module button

    Scenario: TC0113 Testing redirect to price list page
    * Verify that it goes to the Fiyat Listesi Page

    Scenario: TC0114 Testing redirect to dashboard page
    * Click on the Dashboard page link
    * Verify that it goes to the Dashboard Page

    Scenario: TC0116 Testing to search product with Ara button
    * Search Product With Ara Button
    * Verifies that product information is displayed on the page

    Scenario: TC0107 Testing to add price list
    * Add New Price List
    * Verify that the Kolon guncellendi pop-up is displayed
    * Verify that the new Price list has been added

    Scenario: TC0121 Testing to delete price list
    * Delete price list
    * Verify that the Kolon Silindi pop-up is displayed
    * Verify that the new Price list has been deleted
    @smok
    Scenario: TC0122 Testing to update price list information
    * Update price list information
    * Verify that the Kolon guncellendi pop-up is displayed
    * Verify that the Price list has been updated

    Scenario: TC0123 Testing to update product list
    * Update product price
    * Verify that the Fiyatlar Guncellendi pop-up is displayed
    * Verify that the product price has been updated

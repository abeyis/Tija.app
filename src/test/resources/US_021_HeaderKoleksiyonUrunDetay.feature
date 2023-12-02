@Header
Feature: Header

  Background: Login to Tija
    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla

  @HeaderCollection
    Scenario: Adding Collection page

    Given Click the + button in the Header section
    When Click on the "Koleksiyon" button
    When Verify collection page has been added

    @HeaderProductDetail
    Scenario: Adding Product Detail page

      Given Click the + button in the Header section
      When Click on the "Ürün Detay" button
      When Verify product detail page has been added

    @HeaderTransition
    Scenario: Verifying transition between pages

      Given Click on the dropdown button
      When Choose a new page
      When verify transition to new page

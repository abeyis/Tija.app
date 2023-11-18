@dzynLogo
@regression
Feature: [TG7-57] Logo image should be able to be added and deleted on the design page

  Background:
    * login to app
    * Click the "Online Mağaza" module button
    * Click the "Dizayn" module button
    * Dizayn etmek istediği sayfaya tıkla
    * Başlık butonuna tıkla

  Scenario: TC0152 Testing to delete logo image

    * Delete logo image
    * Verify that the Islem basarili PupUp is displayed
    * Verify that the Logo Image has been deleted



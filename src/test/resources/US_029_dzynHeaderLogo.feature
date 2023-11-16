@dzynLogo
Feature: [TG7-57] Bir tija.app B2C kullanıcısı, dizayn sayfasina kendi logosunu ekleyebilmelidir.

  Background:
    * login to app
    * Click the Online Magaza button
    * Click panel Dizayn
    * Click panel abeyisWeb
    * Click on the header button

  Scenario: TC0152 dizayn sayfasindaki logoyu silme  testi.

    * Click on the gorseli kaldir button for LOGO
    * Verify that the Islem basarili PupUp is displayed
    * Verify that the new Logo Image has been deleted



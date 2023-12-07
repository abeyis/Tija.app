Feature: TG7-55  | US_022 | Header - Top bar configuration tests

  Background: Perform login process to app and Baslık section before each scenario

    * login to app
    * Click the "Online Mağaza" module button
    * Click the "Dizayn" module button
    * Dizayn etmek istediği sayfaya tıkla
    * Başlık butonuna tıkla

  Scenario: TC0205 - TG7-221 | Test to textually organized the topbar type

    Then save topbar type as a text: "DENEME"
    Then confirm topbar type as a text: "DENEME"

  Scenario: TC0206 - TG7-222 | Test to visually organized the topbar type

    Then save topbar type as visual
    Then confirm topbar type as visual added

  Scenario: TC0207 - TG7 - 223 | Test to delete image added by visually organized in topbar

    Then delete the image
    Then confirm the image deleted


Feature: TG7-38 | US_008 |  Creating Page Tests and TG7-41 | US_011 | Updating and deleting added pages

Background: Perform login process before each scenario

* login to app
* Click the "Online Mağaza" module button
* Click the "Sayfalar" module button


Scenario: TC0215 - TG7-83 | US_008 | Test page creation by entering only header information
  * add page with "Yalnızca Başlık" only
  * confirm "Yalnızca Başlık" page added

Scenario: TC0214 - TG7-84 | US_008 | Test page creation by entering title and content
  * add page with "Bilgi Güvenliği" and content
  * confirm "Bilgi Güvenliği" page added

Scenario: TC0213 - TG7-87 | US_011 | Test to update saved title and content
  * update saved "Bilgi Güvenliği"
  * confirm page updated

Scenario: TC0212  - TG7-88 | US_011 | Test to delete saved page
  * delete saved "Bilgi Güvenliği"
  * confirm "Bilgi Güvenliği" page deleted



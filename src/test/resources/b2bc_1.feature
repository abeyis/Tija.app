@edaB2BC_1
Feature:Bir tija.app kullanicisi ve ayni zamanda B2B firmasi olarak onceden olusturmus oldugum firmalarimin bilgilerini
        ayni anda goruntuleyebilecegim bir sayfanin olmasini istiyorum.

  Background:
    * login to app
    * Click panel BtwoBC

  Scenario:TC0126 B2BC butonunun B2BC sayfasina yonlendirdigini dogrulama testi
    * Verify that it goes to the BtwoBC Page

  Scenario:TC0127 B2BC sayfasinda bulunan Dashbord sayfa linkinin Dashbord sayfasina yonlendirdigini dogrulama testi.
    * Click on the Dashboard page link
    * Verify that it goes to the Dashboard Page

  Scenario:TC0131 B2BC sayfasinda arama cubugu ile firma aramasini Ara butonu ile yapabilme testi.
    * The firma name is written in the Firma arayin textbox and the click on the Ara button
    * Verify that firma information is displayed on the page

  Scenario:TC0132 B2BC sayfasinda arama cubugu ile firma aramasini enter tusu ile yapabilme testi.
    * The firma name is written in the Firma arayin textbox and press enter
    * Verify that firma information is displayed on the page

    Scenario:TC0149 Daha onceden olusturulmus firmalarin B2BC sayfasinda goruntulendigini dogrulama testi
    * Verify that previously added companies are displayed



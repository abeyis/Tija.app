@edaFl
    @wip
Feature:Bir tija.app kullanicisi ve ayni zamanda B2B firmasi olarak alt bayilerim olan firmalara ayni urunler icin farkli fiyatlar verebilecegim yeni
       fiyat listeleri olusturabilmek istiyorum ve ayrica tum urunlerimin fiyatlarini ayni anda goruntuleyebilecegim bir sayfanin olmasini istiyorum.

    Background:
        * login to app
        * Click the Online Magaza button
        * Click panel Fiyat Listesi


    Scenario:TC0113 Fiyat Listesi butonunun fiyat listesi sayfasina yonlendirdigini dogrulama testi.
    * Verify that it goes to the Fiyat Listesi Page

    Scenario:TC0114 Fiyat Listesi sayfasinda bulunan Dashbord sayfa linkinin Dashbord sayfasina yonlendirdigini dogrulama testi.
    * Click on the Dashboard page link
    * Verify that it goes to the Dashboard Page

    Scenario:TC0116 Fiyat Listesi sayfasinda arama cubugu ile urun aramasini ara butonu ile yapabilme testi
    * The product name is written in the Ne Aramistiniz textbox and the click on the Ara button
    * Verifies that product information is displayed on the page

    Scenario:TC0107 Yeni fiyat listesi ekleme testi
    * Click on the Yeni Fiyat button
    * Fill in the relevant fields in the window that opens and click on the Olustur button
    * Verify that the Kolon guncellendi pop-up is displayed
    * Verify that the new Fiyat listesi has been added

    Scenario:TC0121 Fiyat listesi silme testi
    * Click on Silinecek Fiyat Listesi
    * Click on the Duzenle button
    * Click on the Sil button
    * Click on the second Sil button
    * Verify that the Kolon Silindi pop-up is displayed
    * Verify that the Silinecek Fiyat listesi has been deleted

    Scenario:TC0122 Fiyat listesi bilgileri uzerinde guncelleme ("kolon liste adi,kolon aciklama,kolon sira") yapma testi.
    * Click on Guncellenecek Fiyat Listesi
    * Click on the Duzenle button
    * Fill in the relevant fields in the window that opens and click on the Guncelle button
    * Verify that the Kolon guncellendi pop-up is displayed
    * Verify the updates made on the Fiyat Listesi information

    Scenario:TC0123 Fiyat listelerindeki urun fiyatlarinda guncelleme yapabilme testi.
    * Click on GalaxyBudsLiveFiyatTextBox,delete the old price and enter the new price
    * Click on DegisiklikleriKaydet Button
    * Verify that the Fiyatlar Guncellendi pop-up is displayed
    * Verify the updates made on the GalaxyBudsLiveFiyat information

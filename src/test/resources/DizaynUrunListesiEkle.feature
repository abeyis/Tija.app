

Feature: [US_001] Urun Listesi ekleme

  Background:

    * login to app
    * Kullanıcı Online Magaza butonuna tıklar
    * Kullanıcı Dizayn butonuna tıklar
    * Kullanıcı dizayn etmek istediği sayfaya tıklar

  Scenario:[TC_001] Urun Listesi butonuna tiklama

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Kullanıcı Urun Listesi butonunun eklendigini dogrular


Scenario: [TC_001] Urun Listesini gizleme

  * Kullanici Urun Listesini gizler
  * Kullanici Urun Listesini gizledigini dogrular

  @inci
  Scenario: [TC_001] Urun Listesini silme

    * Kullanici Urun Listesini siler
    * Kullanici Urun Listesini sildigini dogrular
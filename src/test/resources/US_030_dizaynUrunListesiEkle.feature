@wip
@regression
Feature: [US_001] Urun Listesi ekleme

  Background:

    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla

  Scenario:[TC_001] Urun Listesi butonuna tiklama

    * Click the "Bölüm ekle" module button
    * Get product list count
    * Click the "Ürün Listesi" module button
    * Kullanıcı Urun Listesi butonunun eklendigini dogrular


  Scenario: [TC_002] Urun Listesini gizleme

    * Click the "Bölüm ekle" module button
    * Click the "Ürün Listesi" module button
    * Kullanici Urun Listesini gizler
    * Kullanici Urun Listesini gizledigini dogrular

  Scenario: [TC_003] Urun Listesini silme

    * Click the "Bölüm ekle" module button
    * Click the "Ürün Listesi" module button
    * Kullanici Urun Listesini siler
    * Kullanici Urun Listesini sildigini dogrular

  Scenario: [TC_004] Ozel Kolesksiyon ekleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Ürün Listesi" module button
    * Dropdown menuden Ozel Koleksiyon secilir
    * Koleksiyon sec butonuna tiklanir
    * Acilan ekranda herhangi bir koleksiyon secilir
    * Satir Urun Sayisi sliderindan urun sayisi secilir
    * Urun Sayisi sliderindan urun sayisi secilir
    * Ekranin sag ust tarafinda bulunan Kaydet secenegine tiklanir
    * Eklenen Ozel Koleksiyonun eklendigi dogrulanir

  @inci
  Scenario: [TC_005] Urun ekleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Ürün Listesi" module button
    * Dropdown menuden Urun Sec secilir
    * Daha fazla ekle butonuna tiklanir
    * Urun secmek icin tiklayin butonuna tiklanir
    * Acilan ekranda herhangi bir urun secilir
    * Satir Urun Sayisi sliderindan urun sayisi secilir
    * Ekranin sag ust tarafinda bulunan Kaydet secenegine tiklanir
    * Eklenen urunlerin eklendigi dogrulanir
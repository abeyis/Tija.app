

Feature: [US_001] Urun Listesi ekleme

  Background:

    * login to app
    * Click the Online Magaza button
    * Click panel Dizayn
    * Click panel abeyisWeb

  Scenario:[TC_001] Urun Listesi butonuna tiklama

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Kullanıcı Urun Listesi butonunun eklendigini dogrular


  Scenario: [TC_002] Urun Listesini gizleme

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Kullanici Urun Listesini gizler
    * Kullanici Urun Listesini gizledigini dogrular

  Scenario: [TC_003] Urun Listesini silme

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Kullanici Urun Listesini siler
    * Kullanici Urun Listesini sildigini dogrular

  Scenario: [TC_004] Ozel Kolesksiyon ekleme testi

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Dropdown menuden Ozel Koleksiyon secilir
    * Koleksiyon sec butonuna tiklanir
    * Acilan ekranda herhangi bir koleksiyon secilir
    * Satir Urun Sayisi sliderindan urun sayisi secilir
    * Urun Sayisi sliderindan urun sayisi secilir
    * Ekranin sag ust tarafinda bulunan Kaydet secenegine tiklanir
    * Eklenen Ozel Koleksiyonun eklendigi dogrulanir

  @inci
  Scenario: [TC_005] Urun ekleme testi

    * Kullanıcı Bolum Ekle butonuna tıklar
    * Kullanıcı Urun Listesi butonuna tıklar
    * Dropdown menuden Urun Sec secilir
    * Daha fazla ekle butonuna tiklanir
    * Urun secmek icin tiklayin butonuna tiklanir
    * Acilan ekranda herhangi bir urun secilir
    * Satir Urun Sayisi sliderindan urun sayisi secilir
    * Ekranin sag ust tarafinda bulunan Kaydet secenegine tiklanir
    * Eklenen urunlerin eklendigi dogrulanir
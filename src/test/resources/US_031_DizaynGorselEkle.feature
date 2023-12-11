
Feature: [US_002] Gorsel ekleme

  Background:

    Given login to app
    When Click the "Online Mağaza" module button
    When Click the "Dizayn" module button
    And  Dizayn etmek istediği sayfaya tıkla

  Scenario:[TC_001] Gorsel butonuna tiklama

    * Gorsel urun listesi sayisi
    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Kullanici Görsel butonunun eklendigini dogrular

  Scenario: [TC_002] Gorsel gizleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Kullanici gorselini gizler
    * Kullanici gorselini gizledigini dogrular

  Scenario: [TC_003] Gorsel silme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Kullanici Gorselini siler
    * Kullanici Gorselini sildigini dogrular
@inci
  Scenario: [TC_004] Banner ekleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Banner ekleme
    * Banner eklendigini dogrula

  Scenario: [TC_006] Bannera eklenen gorseli duzenleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Bannera eklenen gorseli duzenleme
    * Bannera eklenen gorseli duzenlendigini dogrulama
@nc
  Scenario Outline: [TC_008] [TC_009] Eklenen Görsel üzerinde düzenleme kısmında yönlendir butonuna tıklandıktan sonra yönlendirilecek alanları seçip
  tıklama ile yönlerme testi

    * Click the "Görsel" module button
    * click duzenle button
    * click "<clickOne>" and click "<clickTwo>"
    * verify "<clickTwo>" redirect

    Examples:
      | clickOne   | clickTwo       |
      | Koleksiyon | Smart Watch    |
      | Ürün       | Galaxy Buds2   |
      | Marka      | Apple          |
      | Sayfa      | İade Koşulları |
      | Link       | Christmas      |

  Scenario: [TC_010] Eklenen Görseli silme testi
    * Bannera eklenen gorseli silme
    * Bannera eklenen gorselin silindigini dogrulama

  Scenario: [TC_011] Banneri duzenleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Banner ekleme
    * Eklenen banneri duzenleme
    * Eklenen bannerin duzenlendigini dogrulama

  Scenario: [TC_011] Bannera kolon ekleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Banner ekleme
    * Bannera kolon ekleme
    * Bannera kolon eklendigini dogrula

  Scenario: [TC_012] Bannera eklenen kolonu duzenleme testi

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Banner ekleme
    * Bannera kolon ekleme
    * Bannera eklenen kolonu duzenleme
    * Bannera eklenen kolonun duzenlendigini dogrulama

  Scenario: [TC_014] Banner silme

    * Click the "Bölüm ekle" module button
    * Click the "Görsel" module button
    * Banner ekleme
    * Eklenen banneri silme
    * Eklenen bannerin silindigini dogrulama
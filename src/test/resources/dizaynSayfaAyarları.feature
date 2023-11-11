@DizaynSayfaAyarları
Feature: Dizayn Sayfa Ayarları


  Background: login_ol_and_dizaynsayfasına_git
    Given login to app
    When Kullanıcı Online Magaza butonuna tıklar
    When Kullanıcı Dizayn butonuna tıklar
    And  Kullanıcı dizayn etmek istediği sayfaya tıklar
    Then Kullanıcı Dizayn sayfasında oldugunu dogrular

@TC01
  Scenario:Başlık butonuna tıklayıp sayfa sayarlarını gerçekleştir

  Given Kullanıcı Başlık butonuna tıklar
  When Kullanıcı Sayfa Ayarları butonuna tıklar
  And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden oluşturacağı sayfanın başlığı için Başlık text box'ına valid bir değer girer
  And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden Sayfa genişliğini seçer
  And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümündeki Aktif butonunu aktif hale getirir
  And Kullanıcı Sayfa Ayarlarını kaydetmek için Kaydet butonuna tıklar
  Then Kullanıcı "İşlem başarılı" yazısının görüldüğünü dogrular

  @TC02
  Scenario: Main butonuna tıklayıp sayfa ayarlarını gerçekleştir

    Given Kullanıcı Main bölümünden bir görsel veya bir ürüne tıklar
    When Kullanıcı Sayfa Ayarları butonuna tıklar
    And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden oluşturacağı sayfanın başlığı için Başlık text box'ına valid bir değer girer
    And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden Sayfa genişliğini seçer
    And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümündeki Aktif butonunu aktif hale getirir
    And Kullanıcı Sayfa Ayarlarını kaydetmek için Kaydet butonuna tıklar
    Then Kullanıcı "İşlem başarılı" yazısının görüldüğünü dogrular

    @TC03
    Scenario: Alt Bilgi butonuna tıklayıp sayfa ayarlarını gerçekleştir

      Given Kullanıcı Alt Bilgi butonuna tıklar
      When Kullanıcı Sayfa Ayarları butonuna tıklar
      And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden oluşturacağı sayfanın başlığı için Başlık text box'ına valid bir değer girer
      And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümünden Sayfa genişliğini seçer
      And Kullanıcı dizayn sayfasının sağ tarafında bulunan Sayfa Ayarları bölümündeki Aktif butonunu aktif hale getirir
      And Kullanıcı Sayfa Ayarlarını kaydetmek için Kaydet butonuna tıklar
      Then Kullanıcı "İşlem başarılı" yazısının görüldüğünü dogrular

      @TC04
      Scenario: Sayfa ayarlarından oluşturulan sayfayı sil

        Given Kullanıcı Sayfa Ayarları butonuna tıklar
        And Kullanıcı silmek istediği sayfanın bilgileriyle Sayfayı sil butonuna tıklar
        And Kullanıcı açılan pencerede "Sayfayı silmek istediğinize emin misiniz? " sorusunu görüp evet butonuna tıklar
        Then Kullanıcı sayfanın silindigini dogrular

        @TC05
        Scenario: Sayfa ayarlarından sayfanın kopyasını oluştur

          Given Kullanıcı Sayfa Ayarları butonuna tıklar
          And Kullanıcı kopyasını oluşturmak istediği sayfanın bilgileriyle Kopya oluştur butonuna tıklar
          Then Kullanıcı sayfanın kopylandıgını dogrular





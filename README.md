# Pegasus Test - Selenium

## Projenin Çalıştırılması
Bilgisayarınıza projenin kaynak dosyalarını klonlayın

```
git clone https://github.com/Elgin97/pegasus-test.git
```
Test etmek istediğiz dosyalar
* Control.java
* HomePage.java
* UcusBilgileri.java
* UcusSec.java
* UyeGirisi.java

çalıştırmak istediğiniz dosyadaki main methodunu çalıştırın.

## Proje Amacı

**Control** ' de

* Giriş sayfasındaki (Ucuz Uçak Bileti Ara,Online Check-In...) butonlarının çalışıp çalışmadığı kontrol ediliyor


<hr>

**HomePage** ' de

* Eğer üyeliğimiz varsa üye olarak giriş yapmamızı sağlıyor

<hr>

**UcusBilgileri** ' de

* Belirttiğimiz tarihleri (30 Haziran 2022-31 Temmuz 2022) seçiyor
* Ucuz Uçuş Ara butonuyla uçak seferlerinin olduğu sayfaya yönlendiriyor

<hr>

**UcusSec** ' de

* Gidiş için Uçuş Tarihi seçimi yapılıyor
* Dönüş için Uçuş Tarihi seçimi yapılıyor.
* Açılan sayfada Misafir olarak devam et butonuna basıp yolcu bilgilerinin olduğu sayfaya yönlendiriliyoruz.
* Yolcu ve İletişim Bilgileri kısmına bilgileri gönderiyoruz.
* Devamında koltuk seçimi yapıyoruz
* Yemek Seçimi,Bagaj Seçimi,Uçak İçi Eğlence Seçimi ve Diğer hizmetler
  butonlarına kontrol amaçlı birer kez tıklıyoruz
* Sonrasında 'Devam' butonuna tıklarsak ödeme sayfasına yönlendiriliyoruz

<hr>

**UyeGirisi** ' de

* Üyelik için ilgili alanlar doldurulup üye olunuyor



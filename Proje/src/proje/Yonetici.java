package proje;

import java.util.ArrayList;

public class Yonetici extends Personel {

    
    ArrayList<Personel> personeller = new ArrayList<>();
    Personel p;
    String ad, soyad;
    int yas;
    boolean ygiris, ycikis = false;

    public Yonetici() {
        super();
    }

    public Yonetici(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    void yoneticiGiris() {
        if (ygiris == true) {
            System.out.println("Bir yönetici birden fazla giriş yapamaz.");
        } else {
            System.out.println("Hoşgeldiniz, " + this.ad + " " + this.soyad + " lütfen şifreyi giriniz.");
            int sifre = s.nextInt();
            for (int i = sifre; sifre != 1919; i++) {
                System.out.println(this.ad + " " + this.soyad + " hatalı şifre. Lütfen tekrar deneyiniz.");
                sifre = s.nextInt();
            }
            System.out.println("Giriş başarılı, iyi çalışmalar.");
            ygiris = true;
        }
    }

    void yoneticiCikis() {
        if (ygiris == false) {
            System.out.println("Giriş yapılmadan çıkış yapılamaz. Lütfen giriş yapınız.");
        } else {
            if (ycikis == true) {
                System.out.println("Bir yönetici birden fazla çıkış yapamaz.");
            } else {
                System.out.println(this.ad + " " + this.soyad + " Çıkışınız yapılmıştır. İyi günler dileriz.");
                ycikis = true;
            }
        }
    }

    void personelListele() {
        System.out.println();
        System.out.println("----------------Personel Listesi----------------");
        for (int i = 0; i < personeller.size(); i++) {
            System.out.println(personeller.get(i));
        }
    }

    void personelEkle(Personel p) {
        if (!personeller.contains(p)) {
            personeller.add(p);
        }       
    }

    void personelSil(Personel p) {
        if (this.p == null) {
            personeller.remove(p);
        }
    }

    void personelTatil(Personel p) {
        if (tatil == true) {
            System.out.println("Bir personele birden fazla tatil verilemez.");
        } else {
            System.out.println(p.getAd() + " " + p.getSoyad() + " " + " izinlisiniz");
            p.tatil = true;
        }
    }

    void mevcutPersonelSayi() {
        System.out.println("Bugün işe " + mevcut + " kişi gelmiştir.");

    }

    void geldiMi(Personel p) {
        if (tatil == true || izin == true) {
            System.out.println("İzinlidir.");
        } else if (p.giris == true) {
            System.out.println("Geldi");
        } else {
            System.out.println("Gelmedi");
        }
    }

    void saatCizelge() {
        System.out.println();
        System.out.println("----------------Personel Çalışma Saat Çizelgesi----------------");
        for (int i = 0; i < personeller.size(); i++) {
            System.out.println(personeller.get(i));
            if (personeller.get(i).tatil == true) {
                System.out.println("İzinlidir.");
                personeller.get(i).saat = 0;
            } else if (personeller.get(i).izin == true) {
                System.out.println("İzinlidir.");
            } else if (personeller.get(i).giris == true) {
                System.out.println("İşe gelmiştir.");
            } else {
                System.out.print("İşe gelmemiştir.");
            }
            System.out.println("Çalışılan saat: " + personeller.get(i).saat);
            System.out.println();
        }
    }

    void personelSayi() {
        System.out.println("Personel sayısı: " + personeller.size());
    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int getYas() {
        return yas;
    }

    @Override
    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Yönetici{" + "yöneticiler=" + ", adi=" + this.ad + ", soyadi="
                + this.soyad + ", yasi=" + this.yas + '}';
    }

}

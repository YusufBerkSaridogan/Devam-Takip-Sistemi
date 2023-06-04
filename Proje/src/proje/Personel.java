package proje;

import java.util.Scanner;

public class Personel {
       
    private String ad, soyad;
    private int yas;
    boolean giris = false;
    boolean tatil = false;
    boolean cikis = false;
    boolean izin = false;
    static int mevcut = 0;
    int saat;
    Scanner s = new Scanner(System.in);

    public Personel() {
    }

    public Personel(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    void personelGiris() {
        if (giris == true) {
            System.out.println(this.ad + " " + this.soyad + " bir personel birden fazla giriş yapamaz.");
        } else {
            mevcut++;
            System.out.println("Hoşgeldiniz, " + this.ad + " " + this.soyad + " lütfen şifreyi giriniz.");
            int sifre = s.nextInt();
            for (int i = sifre; sifre != 1881; i++) {
                System.out.println("Hatalı şifre. Lütfen tekrar deneyiniz.");
                sifre = s.nextInt();
            }
            System.out.println("Giriş başarılı, iyi çalışmalar.");
            giris = true;
        }
    }

    void personelCikis() {
        if (giris == false) {
            System.out.println(this.ad + " " + this.soyad + " giriş yapılmadan çıkış yapılamaz. Lütfen giriş yapınız.");
        } else {
            if (cikis == true) {
                System.out.println(this.ad + " " + this.soyad + " bir personel birden fazla çıkış yapamaz.");
            } else {
                System.out.println(this.ad + " " + this.soyad + " çıkışınız yapılmıştır. İyi günler dileriz.");
                cikis = true;
            }
        }
    }

    void izinTalep() {
        if (izin == true) {
            System.out.println("Bir personel birden fazla izin talep edemez.");
        } else {
            int x = (int) (1 + Math.random() * 100);
            if (x > 90) {
                System.out.println(this.ad + " " + this.soyad + " izin talebi kabul edildi");
                izin = true;
            } else {
                System.out.println(this.ad + " " + this.soyad + " izin talebi reddedildi.");
            }

        }
    }

    void saaT(int x) {
        if (izin == true || tatil == true) {
            System.out.println(this.ad + " " + this.soyad + " izinli olduğunuz için saat girişi yapamazsınız.");
        } else {
            while (x < 6 && giris == true) {
                System.out.println(this.ad + " " + this.soyad + " en az 6 saat çalışılmalıdır. Lütfen mesainizi doldurun.");
                System.out.println("***Personel işine geri dönüp kalan süresini tamamlar ve yeniden saat girişi istenir***");
                x = s.nextInt();
            }
            if (giris == true) {
                saat = x;
            } else {
                saat = 0; System.out.println(this.ad + " " + this.soyad + " giriş yapmadığınız için saat girişi kabul edilmedi.");
            }
        }
    }

    void saaT(double x) {
        if (izin == true || tatil == true) {
            System.out.println(this.ad + " " + this.soyad + " izinli olduğunuz için saat girişi yapamazsınız.");
        } else {

            while (x < 6 && giris == true) {
                System.out.println(this.ad + " " + this.soyad + " en az 6 saat çalışılmalıdır. Lütfen mesainizi doldurun.");
                x = s.nextInt();
            }
            if (giris == true) {
                saat = (int) x;
            } else {
                saat = 0; System.out.println(this.ad + " " + this.soyad + " giriş yapmadığınız için saat girişi kabul edilmedi.");
            }
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Personel{" + "ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + '}';
    }

}

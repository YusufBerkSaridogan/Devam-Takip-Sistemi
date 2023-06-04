package proje;

import java.util.ArrayList;

public class Kurul extends Yonetici {

    ArrayList<Yonetici> yoneticiler = new ArrayList<>();
    String ad;
    Yonetici y;
    int kurulusyili;

    public Kurul() {
        super();
    }

    public Kurul(String ad, int kurulusyili) {
        this.ad = ad;
        this.kurulusyili = kurulusyili;
    }

    void yoneticiListele() {
        System.out.println();
        System.out.println("----------------Yönetici Listesi----------------");
        for (int i = 0; i < yoneticiler.size(); i++) {
            System.out.println(yoneticiler.get(i));
        }
    }

    void yoneticiEkle(Yonetici y) {
        if (!yoneticiler.contains(y)) {
            yoneticiler.add(y);
        }
    }

    void yoneticiSil(Yonetici y) {
        if (yoneticiler.size() == 1) {
            System.out.println("Şirkette kalan son yönetici silinemez.");
        } else {
            if (this.y == null) {
                yoneticiler.remove(y);
            }
        }
    }

    void sirketBilgileri() {
        System.out.println("-----------Şirket Bilgileri-----------");
        System.out.println("Şirketin adı: " + this.ad + " " + "\nKuruluş yılı: " + this.kurulusyili);
        System.out.println();
        System.out.println("Yönetici sayısı: " + yoneticiler.size());

    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulusyili() {
        return kurulusyili;
    }

    public void setKurulusyili(int kurulusyili) {
        this.kurulusyili = kurulusyili;
    }

}

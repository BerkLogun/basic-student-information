import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DersHesapla dersler = new DersHesapla();

        System.out.println("Lisans Ogrencisi girmek icin ------ 1");
        System.out.println("Yuksek Lisans Ogrencisi girmek icin ------- 2");
        System.out.println("Doktora Ogrencisi girmek icin -------- 3");
        System.out.println("Yapmak istediginiz islemi tuslayiniz.....");

        int switchSayi = scan.nextInt();

        switch (switchSayi) {

            case 1:

            LisansEkleGoster lisansOgrenci = new LisansEkleGoster();
            lisansOgrenci.ogrenciEkleGoster();
            dersler.dersHesapla();
            break;

            case 2:

            YuksekLisansEkleGoster yuksekLisansOgrenci = new YuksekLisansEkleGoster();
            yuksekLisansOgrenci.yL_ogrenciEkleGoster();
            dersler.dersHesapla();
            break;

            case 3:

            DoktoraEkleGoster doktoraOgrenci1 = new DoktoraEkleGoster();
            doktoraOgrenci1.doktoraEkle();
            dersler.dersHesapla();
            break;

            default:
                System.out.println("Gecersiz secim....");


        }

    }
}




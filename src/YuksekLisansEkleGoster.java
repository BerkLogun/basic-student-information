import java.util.Scanner;

public class YuksekLisansEkleGoster {

    public void yL_ogrenciEkleGoster() {

        YuksekLisans yuksekLisansOgrenci1 = new YuksekLisans(0, "", "", "", "", "");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci No giriniz: ");
        yuksekLisansOgrenci1.setOgrenciNo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ogrenci Adini giriniz: ");
        yuksekLisansOgrenci1.setOgrenciAdi(scanner.nextLine());

        System.out.println("Mezun olunan Lisans bolumunu giriniz:  ");
        yuksekLisansOgrenci1.setOgrenciBolum(scanner.nextLine());

        System.out.println("Mezun olunan okulu giriniz: ");
        yuksekLisansOgrenci1.setOgrenciOkul(scanner.nextLine());

        System.out.println("Yuksek Lisans bolumunu giriniz: ");
        yuksekLisansOgrenci1.yuksekLisansBolum = scanner.nextLine();

        System.out.println("Yuksek Lisans yapilan okulu giriniz: ");
        yuksekLisansOgrenci1.yuksekLisansOkul = scanner.nextLine();



        // Bilgilerin ekrana yazdirilmasi
        System.out.println("Ogrenci Bilgileri Gosteriliyor...");
        System.out.println("Ogrenci No: " + yuksekLisansOgrenci1.getOgrenciNo());
        System.out.println("Ogrenci Adi: " + yuksekLisansOgrenci1.getOgrenciAdi());
        System.out.println("Mezun oldugu bolum: " + yuksekLisansOgrenci1.getOgrenciBolum());
        System.out.println("Mezun oldugu okul: " + yuksekLisansOgrenci1.getOgrenciOkul());
        System.out.println("Yuksek Lisans yaptigi bolum: " + yuksekLisansOgrenci1.yuksekLisansBolum);
        System.out.println("Yuksek Lisans Yapitgi okul: " + yuksekLisansOgrenci1.yuksekLisansOkul);
        System.out.println("Aldigi Dersler...");

    }

}

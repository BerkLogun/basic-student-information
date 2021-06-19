import java.util.Scanner;

public class DoktoraEkleGoster {

    public void doktoraEkle() {

        Doktora doktoraOgrenci1 = new Doktora(0, " ", " ", "", " ", " ", "", "");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci No giriniz: ");
        doktoraOgrenci1.setOgrenciNo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ogrenci Adini giriniz: ");
        doktoraOgrenci1.setOgrenciAdi(scanner.nextLine());

        System.out.println("Mezun olunan Lisans bolumunu giriniz:  ");
        doktoraOgrenci1.setOgrenciBolum(scanner.nextLine());

        System.out.println("Mezun olunan okulu giriniz: ");
        doktoraOgrenci1.setOgrenciOkul(scanner.nextLine());

        System.out.println("Yuksek Lisans bolumunu giriniz: ");
        doktoraOgrenci1.yuksekLisansBolum = scanner.nextLine();

        System.out.println("Yuksek Lisans yapilan okulu giriniz: ");
        doktoraOgrenci1.yuksekLisansOkul = scanner.nextLine();

        System.out.println("Doktora yaptigi bolumu giriniz: ");
        doktoraOgrenci1.doktoraBolum = scanner.nextLine();

        System.out.println("Doktora yaptigi okulu giriniz: ");
        doktoraOgrenci1.doktoraOkul = scanner.nextLine();



        // Bilgilerin ekrana yazdirilmasi
        System.out.println("Ogrenci Bilgileri Gosteriliyor...");
        System.out.println("Ogrenci No: " + doktoraOgrenci1.getOgrenciNo());
        System.out.println("Ogrenci Adi: " + doktoraOgrenci1.getOgrenciAdi());
        System.out.println("Mezun oldugu bolum: " + doktoraOgrenci1.getOgrenciBolum());
        System.out.println("Mezun oldugu okul: " + doktoraOgrenci1.getOgrenciOkul());
        System.out.println("Yuksek Lisans yaptigi bolum: " + doktoraOgrenci1.yuksekLisansBolum);
        System.out.println("Yuksek Lisans Yapitgi okul: " + doktoraOgrenci1.yuksekLisansOkul);
        System.out.println("Doktora yaptigi bolum: " + doktoraOgrenci1.doktoraBolum);
        System.out.println("Doktora yaptigi okul: " + doktoraOgrenci1.doktoraOkul);
        System.out.println("Aldigi Dersler...");

    }
}





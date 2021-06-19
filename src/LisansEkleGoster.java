import java.util.Scanner;

public class LisansEkleGoster {
    public void ogrenciEkleGoster(){
        Lisans ogrenci1 = new Lisans(0," ", "", "");
        Scanner scanner = new Scanner(System.in);

        // Ogrenci bilgilerinin alindigi kod blogu
        System.out.println("Ogrenci No giriniz: ");
        ogrenci1.setOgrenciNo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ogrenci Adini giriniz: ");
        ogrenci1.setOgrenciAdi(scanner.nextLine());

        System.out.println("Ogrenci bolumunu giriniz: ");
        ogrenci1.setOgrenciBolum(scanner.nextLine());

        System.out.println("Ogrenci okulunu giriniz: ");
        ogrenci1.setOgrenciOkul(scanner.nextLine());





        // Bilgilerin ekrana yazdirilmasi
        System.out.println("Ogrenci Bilgileri Gosteriliyor...");
        System.out.println("Ogrenci No: " + ogrenci1.getOgrenciNo());
        System.out.println("Ogrenci Adi: " + ogrenci1.getOgrenciAdi());
        System.out.println("Ogrenci bolumu: " + ogrenci1.getOgrenciBolum());
        System.out.println("Ogrenci okul: " + ogrenci1.getOgrenciOkul());
        System.out.println("Aldigi Dersler...");

    }

}

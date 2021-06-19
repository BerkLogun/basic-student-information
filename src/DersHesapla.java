import java.util.Scanner;

public class DersHesapla {
    public void dersHesapla(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Alinan ders sayisini giriniz");
        int dersSayisi;
        dersSayisi = scanner.nextInt();
        Lisans.DersBilgileri[] ders1 = new Lisans.DersBilgileri[dersSayisi + 1];
        for (int i = 0; i < dersSayisi; i++) {
            ders1[i] = new Lisans.DersBilgileri();
            scanner.nextLine();
            System.out.println((i + 1) + " numarali dersin adini giriniz: ");
            ders1[i].dersAdi = scanner.nextLine();


            System.out.println((i + 1) + " numarali dersin ders kodunu giriniz: ");
            ders1[i].dersKodu = scanner.nextLine();

            System.out.println((i + 1) + "numarali dersin AKTS kredisini giriniz: ");
            ders1[i].dersKredisi = scanner.nextInt();

            System.out.println((i + 1) + " numarali dersin notunu giriniz: ");
            ders1[i].dersNotu = scanner.nextInt();
        }


        int aktsDersNotu = 0;
        int toplamKredi = 0;
        for(int i = 0; i < dersSayisi; i++){
            aktsDersNotu += (ders1[i].dersNotu * ders1[i].dersKredisi);
            toplamKredi += ders1[i].dersKredisi;


        }

        float kumulatifOrtalama;
        kumulatifOrtalama = ((float) aktsDersNotu / toplamKredi);

        System.out.println("Kumulatif ortalama: " + kumulatifOrtalama);




    }
}

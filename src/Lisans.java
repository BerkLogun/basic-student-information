public class Lisans extends AbstractOgrenci {


    public static class DersBilgileri{
       public String dersAdi;
       public String dersKodu;
        public int dersKredisi;
        public int dersNotu;
    }

    Lisans(int ogrenciNo, String ogrenciAdi, String ogrenciBolum, String ogrenciOkul) {
        super(ogrenciNo, ogrenciAdi, ogrenciBolum, ogrenciOkul);

    }

}

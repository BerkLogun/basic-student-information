public class LisansUstu extends AbstractOgrenci{

    public static class DersBilgileri{
        public String dersAdi;
        public String dersKodu;
        public int dersKredisi;
        public int dersNotu;
    }

    public String yuksekLisansBolum;
    public String yuksekLisansOkul;

    LisansUstu(int ogrenciNo, String ogrenciAdi, String ogrenciBolum, String ogrenciOkul, String yuksekLisansBolum, String yuksekLisansOkul) {
        super(ogrenciNo, ogrenciAdi, ogrenciBolum, ogrenciOkul);

        this.yuksekLisansOkul = yuksekLisansOkul;
        this.yuksekLisansBolum = yuksekLisansBolum;
    }
}

public class Doktora extends LisansUstu{

    public String doktoraBolum;
    public String doktoraOkul;

    Doktora(int ogrenciNo, String ogrenciAdi, String ogrenciBolum, String ogrenciOkul, String yuksekLisansBolum, String yuksekLisansOkul, String doktoraBolum, String doktoraOkul) {
        super(ogrenciNo, ogrenciAdi, ogrenciBolum, ogrenciOkul, yuksekLisansBolum, yuksekLisansOkul);

        this.doktoraBolum = doktoraBolum;
        this.doktoraOkul = doktoraOkul;
    }

}

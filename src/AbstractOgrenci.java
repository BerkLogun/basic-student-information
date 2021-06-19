public abstract class AbstractOgrenci {

    public static class DersBilgileri{
        String dersKodu;
        String dersAdi;
        int dersKredisi;
        int dersNotu;

        public DersBilgileri(String dersKodu, String dersAdi, int dersKredisi, int dersNotu){
            this.dersKodu = dersKodu;
            this.dersAdi = dersAdi;
            this.dersKredisi = dersKredisi;
            this.dersNotu = dersNotu;
        }



    }





    private int ogrenciNo;
    private String ogrenciAdi;
    private String ogrenciBolum;
    private String ogrenciOkul;

    AbstractOgrenci(int ogrenciNo, String ogrenciAdi, String ogrenciBolum, String ogrenciOkul){
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciBolum = ogrenciBolum;
        this.ogrenciOkul = ogrenciOkul;
    }


    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    public String getOgrenciBolum() {
        return ogrenciBolum;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    public String getOgrenciOkul() {
        return ogrenciOkul;
    }

    public void setOgrenciOkul(String ogrenciOkul) {
        this.ogrenciOkul = ogrenciOkul;
    }


}

public class Populasi extends Negara {
    private int jumlahPopulasi;
    private int pendapatanRataRata;
    private int umur;

    public Populasi(String namaNegara, String benua, int jumlahPopulasi, int pendapatanRataRata, int umur) {
        //Memanggil Superclass
        super(namaNegara, benua);
        this.jumlahPopulasi = jumlahPopulasi;
        this.pendapatanRataRata = pendapatanRataRata;
        this.umur = umur;
    }

    public int getJumlahPopulasi() {
        return jumlahPopulasi;
    }

    public int getPendapatanRataRata() {
        return pendapatanRataRata;
    }

    public int getUmur() {
        return umur;
    }
}
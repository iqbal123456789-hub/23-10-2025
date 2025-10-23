public class Remaja extends Populasi {
    private int jumlahRemaja;
    private  String pendidikan;

    public Remaja(String namaNegara, String benua, int jumlahPopulasi, int pendapatanRataRata, int umur, int jumlahRemaja, String pendidikan) {
        // Memanggil Subclass
        super(namaNegara, benua, jumlahPopulasi, pendapatanRataRata, umur);
        this.pendidikan = pendidikan;
        this.jumlahRemaja = jumlahRemaja;
    }

    public int getJumlahRemaja() {
        return jumlahRemaja;
    }

    public String getpendidikan() {
        return pendidikan;
    }


}
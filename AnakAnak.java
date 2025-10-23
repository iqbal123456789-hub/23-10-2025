public class AnakAnak extends Populasi {
    private int jumlahAnakAnak;
    private String pendidikan;

    public AnakAnak(String namaNegara, String benua, int jumlahPopulasi, int pendapatanRataRata, int umur, int jumlahAnakAnak, String pendidikan) {
        // Memanggil Subclass
        super(namaNegara, benua, jumlahPopulasi, pendapatanRataRata, umur);
        this.pendidikan = pendidikan;
        this.jumlahAnakAnak = jumlahAnakAnak;
    }

    public int getJumlahAnakAnak() {
        return jumlahAnakAnak;
    }

    public String getPendidikan() {
        return pendidikan;
    }


}
public class Dewasa extends Populasi {
    private int jumlahDewasa;
    private String pekerjaan;

    public Dewasa(String namaNegara, String benua, int jumlahPopulasi, int pendapatanRataRata, int umur, int jumlahDewasa, String pekerjaan) {
        //memanggil Subclass
        super(namaNegara, benua, jumlahPopulasi, pendapatanRataRata, umur);
        this.pekerjaan = pekerjaan;
        this.jumlahDewasa = jumlahDewasa;
    }

    public int getJumlahOrangTua() {
        return jumlahDewasa;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }


}
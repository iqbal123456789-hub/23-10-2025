public class Pulau extends Negara {
    private String namaPulau;
    private int jumlahPulau;

    public Pulau(String namaNegara, String benua, String namaPulau, int jumlahPulau) {
        // Memanggil Superclass
        super(namaNegara, benua);
        this.namaPulau = namaPulau;
        this.jumlahPulau = jumlahPulau;
    }

    // Metode Getter
    public String getNamaPulau() {
        return namaPulau;
    }

    public int getJumlahPulau() {
        return jumlahPulau;
    }
}

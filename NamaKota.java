public class NamaKota {
    public static void main(String[] args) {
        String[] kota = {"Malang", "Surabaya", "Denpasar", "Bandung", "Jakarta", "Makassar", "Balikpapan"};
        System.out.println("Nama Kota");
        for (int i = 0; i < kota.length; i++) {
            System.out.println(kota[i]);
        }
        System.out.println();
        String[] mapel = {"Matematika", "Bahasa Indonesia", "Bahasa Inggris", "Sejarah", "IPAS", "PJOK", "Seni Budaya"};
        System.out.println("Mata Pelajaran");
        for (int i = 0; i < mapel.length; i++) {
            System.out.println(mapel[i]);
        }
        System.out.println();
        String[] hewan = {"Kucing", "Anjing", "Ikan", "Kelinci", "Kambing"};
        System.out.println("Nama Hewan Peliharaan");
        for (int i = 0; i < hewan.length; i++){
            if (hewan[i].length() > 4) {
                System.out.println(hewan[i]);
            } 
          }
        }
    }

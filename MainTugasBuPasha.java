public class Main {
    public static void main(String[] args) {
        Pulau P = new Pulau("Indonesia", "Asia", "Jawa", 17504);
        System.out.println("--- Pulau ---");
        System.out.println("Nama Negara: " + P.getNamaNegara());
        System.out.println("Benua: " + P.getBenua());
        System.out.println("Nama Pulau Utama: " + P.getNamaPulau());
        System.out.println("Jumlah Pulau (estimasi): " + P.getJumlahPulau());
        System.out.println("------------------\n");

        Populasi p = new Populasi("Indonesia", "Asia", 286693673, 6500000, 0);
        System.out.println("--- Populasi ---");
        System.out.println("Nama Negara: " + p.getNamaNegara());
        System.out.println("Benua: " + p.getBenua());
        System.out.println("Jumlah Populasi: " + p.getJumlahPopulasi());
        System.out.println("Pendapatan Rata-Rata; " + p.getJumlahPopulasi());
        System.out.println("------------------\n");

        AnakAnak A = new AnakAnak(
            "Indonesia",
            "Asia",
            280000000,
            40000000,
            12,
            60000000,
            "SD Kelas 6"
            //kenapa kok pake koma bukan titik dua?
            //Karna koma digunakan untuk memisahkan item dalam sebuah daftar kayak diatas
            //terus kenapa kok yang pendidikan ga ada koma? karna pendidikan merupakan akhir dari konstruktor ya guysss (Shout out untuk youtube)
        );
        System.out.println("--- Poupulasi Anak-Anak ---");
        System.out.println("Nama Negara: " + A.getNamaNegara());
        System.out.println("Jumlah Populasi Total: " + A.getJumlahPopulasi());
        System.out.println("Pendapatan Rata-Rata: Rp" + A.getPendapatanRataRata());
        System.out.println("Umur Batasan Kategori: " + A.getUmur() + " tahun");
        System.out.println("Jumlah Anak-Anak: " + A.getJumlahAnakAnak());
        System.out.println("Pendidkan: " + A.getPendidikan());
        System.out.println("----------------------\n");
        //kenapa sih kok ada "\n"? itu biar outputnya ga berantakan gesss (Udah ngotak atik berjam jam perkoro amburadul)

        Remaja R = new Remaja(
            "Indonesia",
            "Asia",
            280000000,
            40000000,
            18,
            50000000,
            "SMA Kelas 3"
            //Penjelasan ada diatas
        );
        System.out.println("--- Populasi: Remaja ---");
        System.out.println("Nama Negara: " + R.getNamaNegara());
        System.out.println("Jumlah Populasi Total: " + R.getJumlahPopulasi());
        System.out.println("Umur Batasan Kategori: " + R.getUmur() + " tahun");
        System.out.println("Jumlah Remaja: " + R.getJumlahRemaja());
        System.out.println("Pendidikan: " + R.getpendidikan());
        System.out.println("-----------------------------\n");
        //penjelasan \n ada diatas

        Dewasa OrTu = new Dewasa(
            "Indonesia",
            "Asia",
            280000000,
            40000000,
            60,
            35000000,
            "Wiraswasta"
            //Penjelasannya ada Diatas ya gess
        );
        System.out.println("--- Populasi Orang Tua ---");
        System.out.println("Nama Negara: " + OrTu.getNamaNegara());
        System.out.println("Jumlah Populasi Total: " + OrTu.getJumlahPopulasi());
        System.out.println("Umur Batasan Kategori: " + OrTu.getUmur() + " tahun ke atas");
        System.out.println("Jumlah Orang Tua: " + OrTu.getJumlahOrangTua());
        System.out.println("Pekerjaan: "+ OrTu.getPekerjaan());
        System.out.println("----------------------\n");
        //penjelasan \n ada diatas
    }
}
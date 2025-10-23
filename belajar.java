public class belajar {
    public static void main(String[] args) {
        String namaSiswaXR8[]={"Sakti", "Ilham", "Djibril", "Hisyam"};
        String[] eskul={"Futsal", "Basket", "Badminton"};
        String alamat[]={"Malang", "Surabaya", "Jember", "Bandung"};
        char jenisKelamin[]= new char[2];
        jenisKelamin[0]='P';
        jenisKelamin[1]='L';

        System.out.println(jenisKelamin[0]);
        System.out.println(jenisKelamin[1]);

        System.out.println("List Nama Siswa R8");
        for (int i = 0; i < namaSiswaXR8.length; i++) {
            System.out.println(namaSiswaXR8[i]);
        }
    }
}
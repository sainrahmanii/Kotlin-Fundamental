public class Manusia{
    // cara membuat atribute, yaitu membuat didalam sebuah class
    String nama = "Husain Rahmani";
    String jenisKelamin = "Pria";
    int tinggiBadan = 160;
    int beratBadan = 60;

    /**
     * cara membuat object
     * 1. declaration: mendeklarasikan nama object yang akan dibuat
     * 2. instantiation : Menggunakan perintah new untuk menciptakan sebuah object
     * 3. initialization : Menginisialisasi sebuah object setelah perintah new
    */

    public static void main(String[] args) {
        // Declaration      // Instantiation
        Manusia mahasiswa = new Manusia (); // Initialization

        System.out.println("Nama : " + mahasiswa.nama);
        System.out.println("Kelamin : " + mahasiswa.jenisKelamin);
        System.out.println("Tinggi Badan : " + mahasiswa.tinggiBadan);
        System.out.println("Berat Badan : " + mahasiswa.beratBadan);
    }

    /**
     * Rangkuman materi class, object, attribute
     * Class = Diibaratkan sebuah blueprint, ataupun cetakan untuk membuat object
     * Object = Instance atau hasil dari class
     * Declaration = <NamaKelas> namaVariable;
     *              NamaKelas adalah class yang akan dibuat objectnya;
     *              namaVariable adalah nama object yang dibuat dari kelas
     * Instantiation = new NamaKelas();
     *                 NamaKelas(); adalah nama method constructor dari class
     * Constructor = Method yang pertama kali dijalankan untuk membuat object;
     * */
}
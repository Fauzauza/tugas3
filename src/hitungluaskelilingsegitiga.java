public class hitungluaskelilingsegitiga {

    /**
     * Menghitung luas segitiga.
     *
     * @param alas   Panjang alas segitiga.
     * @param tinggi Tinggi segitiga.
     * @return Luas segitiga.
     */
    public static double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    /**
     * Menghitung keliling segitiga.
     *
     * @param sisiA Panjang sisi A segitiga.
     * @param sisiB Panjang sisi B segitiga.
     * @param sisiC Panjang sisi C segitiga.
     * @return Keliling segitiga.
     */
    public static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        // Contoh penggunaan
        double alas = 5;
        double tinggi = 8;
        double sisiA = 3;
        double sisiB = 4;
        double sisiC = 5;

        double luas = hitungLuas(alas, tinggi);
        double keliling = hitungKeliling(sisiA, sisiB, sisiC);

        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
}

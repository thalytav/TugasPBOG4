import java.util.Scanner; // Import library Scanner untuk mengambil input dari pengguna

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input

        // Menampilkan pesan pembuka dan opsi operasi kalkulator
        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        // Meminta pengguna untuk memilih operasi kalkulator
        System.out.print("Masukkan pilihan operasi (1/2/3/4): ");
        int pilihan = input.nextInt(); // Mengambil input pilihan operasi dari pengguna

        // Meminta pengguna untuk memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble(); // Mengambil input angka pertama

        // Meminta pengguna untuk memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble(); // Mengambil input angka kedua

        double hasil = 0; // Inisialisasi variabel hasil untuk menyimpan hasil perhitungan

        // Struktur kontrol switch untuk memilih operasi yang dipilih pengguna
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2; // Penjumlahan
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil); // Menampilkan hasil penjumlahan
                break;
            case 2:
                hasil = angka1 - angka2; // Pengurangan
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil); // Menampilkan hasil pengurangan
                break;
            case 3:
                hasil = angka1 * angka2; // Perkalian
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil); // Menampilkan hasil perkalian
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2; // Pembagian, hanya jika angka kedua bukan nol
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil); // Menampilkan hasil pembagian
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan."); // Error jika pembagian dengan nol
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid."); // Jika pilihan tidak valid
        }

        input.close(); // Menutup Scanner setelah digunakan
    }
}

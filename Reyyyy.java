import java.util.Scanner;

public class Reyyyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Penjumlahan
        double hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Pengurangan
        double hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        // Perkalian
        double hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Pembagian
        if (angka2 != 0) {
            double hasilPembagian = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasilPembagian);
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }

        scanner.close();
    }
}


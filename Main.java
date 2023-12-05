
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nilaiMataKuliah = new ArrayList<>();

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();

        scanner.nextLine(); // Membersihkan newline setelah nextInt()

        // Looping untuk input nilai mata kuliah
        while (true) {
            System.out.print("Masukkan Mata Kuliah (ketik 'selesai' untuk alternatif mengakhiri): ");
            String mataKuliah = scanner.nextLine();
            
            if (mataKuliah.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();
            System.out.print("Masukkan Nilai: ");
            String nilai = scanner.next();

            scanner.nextLine(); // Membersihkan newline setelah next()

            // Format data menjadi satu string dan tambahkan ke ArrayList
            String dataMataKuliah = mataKuliah + ", " + sks + ", " + nilai;
            nilaiMataKuliah.add(dataMataKuliah);
        }

        // Output nilai mata kuliah yang telah dimasukkan
        System.out.println("\nData Nilai Mata Kuliah Semester " + semester + " - " + namaMahasiswa + ":");
        for (String data : nilaiMataKuliah) {
            System.out.println(data);
        }
    }
}
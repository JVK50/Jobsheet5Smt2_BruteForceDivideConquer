package smt2.jobsheet5.TugasPraktikum;

public class mainMahasiswa13 {
    public static void main(String[] args) {
        mahasiswaMng13 manager = new mahasiswaMng13(8);
        
        // Input data mahasiswa
        manager.mahasiswa[0] = new mahasiswa13("Ahmad", "220101001", 2022, 78, 82);
        manager.mahasiswa[1] = new mahasiswa13("Budi", "220101002", 2022, 85, 88);
        manager.mahasiswa[2] = new mahasiswa13("Cindy", "220101003", 2021, 90, 87);
        manager.mahasiswa[3] = new mahasiswa13("Dian", "220101004", 2021, 76, 79);
        manager.mahasiswa[4] = new mahasiswa13("Eko", "220101005", 2023, 92, 95);
        manager.mahasiswa[5] = new mahasiswa13("Fajar", "220101006", 2020, 88, 85);
        manager.mahasiswa[6] = new mahasiswa13("Gina", "220101007", 2023, 80, 83);
        manager.mahasiswa[7] = new mahasiswa13("Hadi", "220101008", 2020, 82, 84);
        
        // Tampilkan data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println();
        System.out.printf("%-10s %-12s %-12s %-10s %-10s%n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        System.out.println("--------------------------------------------------------------");
        for (mahasiswa13 m : manager.mahasiswa) {
            System.out.println(m.toString());
        }
        System.out.println();
        
        // a) Nilai UTS Tertinggi menggunakan Divide and Conquer
        int utsTertinggi = manager.cariUTSTertinggiDC(0, manager.mahasiswa.length - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + utsTertinggi);
        
        // b) Nilai UTS Terendah menggunakan Divide and Conquer
        int utsTerendah = manager.cariUTSTerendahDC(0, manager.mahasiswa.length - 1);
        System.out.println("b) Nilai UTS Terendah (Divide and Conquer): " + utsTerendah);
        
        // c) Rata-rata Nilai UAS menggunakan Brute Force
        double rataRataUAS = manager.cariRataRataUASBF();
        System.out.println("c) Rata-rata Nilai UAS (Brute Force): " + String.format("%.2f", rataRataUAS));
    }
}

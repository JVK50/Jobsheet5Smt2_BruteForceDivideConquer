package smt2.jobsheet5.TugasPraktikum;

public class mahasiswa13 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    mahasiswa13(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-12s %-12d %-10d %-10d", nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    }
}

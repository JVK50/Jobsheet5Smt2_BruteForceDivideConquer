package smt2.jobsheet5.TugasPraktikum;

public class mahasiswaMng13 {
    mahasiswa13[] mahasiswa;

    mahasiswaMng13(int jumlah) {
        mahasiswa = new mahasiswa13[jumlah];
    }

    // a) Cari Nilai UTS Tertinggi menggunakan Divide and Conquer
    int cariUTSTertinggiDC(int l, int r) {
        if (l == r) {
            return mahasiswa[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int maxKiri = cariUTSTertinggiDC(l, mid);
        int maxKanan = cariUTSTertinggiDC(mid + 1, r);
        
        return Math.max(maxKiri, maxKanan);
    }

    // b) Cari Nilai UTS Terendah menggunakan Divide and Conquer
    int cariUTSTerendahDC(int l, int r) {
        if (l == r) {
            return mahasiswa[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int minKiri = cariUTSTerendahDC(l, mid);
        int minKanan = cariUTSTerendahDC(mid + 1, r);
        
        return Math.min(minKiri, minKanan);
    }

    // c) Cari Rata-rata Nilai UAS menggunakan Brute Force
    double cariRataRataUASBF() {
        int total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total += mahasiswa[i].nilaiUAS;
        }
        return (double) total / mahasiswa.length;
    }

    // Helper: Cari Rata-rata UAS menggunakan Divide and Conquer
    double cariRataRataUASDC(int l, int r) {
        int total = sumUASDC(l, r);
        return (double) total / mahasiswa.length;
    }

    private int sumUASDC(int l, int r) {
        if (l == r) {
            return mahasiswa[l].nilaiUAS;
        }
        
        int mid = (l + r) / 2;
        int sumKiri = sumUASDC(l, mid);
        int sumKanan = sumUASDC(mid + 1, r);
        
        return sumKiri + sumKanan;
    }
}
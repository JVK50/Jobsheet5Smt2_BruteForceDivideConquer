package smt2.jobsheet5.BruteForceDivideConquer;

public class pangkat13 {
    int nilai, pangkat;

    pangkat13(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int n, int p) {
        int hasil = 1;
        for (int i = 0; i < p; i++) {
            hasil *= n;
        }
        return hasil;
    }

    int pangkatDC(int n, int p) {
        if (p==1) {
            return n;
        } else {
            if (p%2 == 1) {
                return (pangkatDC(n, p/2) * pangkatDC(n, p/2) * n);
            } else {
                return (pangkatDC(n, p/2) * pangkatDC(n, p/2));
            }
        }
    }
}

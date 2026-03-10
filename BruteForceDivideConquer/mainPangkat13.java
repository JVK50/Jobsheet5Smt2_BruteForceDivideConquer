package smt2.jobsheet5.BruteForceDivideConquer;
import java.util.Scanner;
public class mainPangkat13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = jvk.nextInt();

        pangkat13[] png = new pangkat13[nilai];
        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = jvk.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = jvk.nextInt();
            png[i] = new pangkat13(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER: ");
        for (pangkat13 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }
        jvk.close();
    }
}

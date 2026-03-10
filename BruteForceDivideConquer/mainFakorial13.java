package smt2.jobsheet5.BruteForceDivideConquer;

import java.util.Scanner;
public class mainFakorial13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = jvk.nextInt();

        Factorial13 fk = new Factorial13();
        System.out.println("Nilai faktorial " + nilai + " dengan BF " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " dengan DC " + fk.faktorialDC(nilai));

        jvk.close();
    }
}

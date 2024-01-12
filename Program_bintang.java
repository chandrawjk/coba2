/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.program_bintang;

/**
 *
 * @author WINDOWS 10
 */
public class Program_bintang {

    public static void main(String[] args) {
        int tinggi = 5; // Ubah tinggi sesuai kebutuhan
//tes
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int a = 1;
        while (a < 5) {
            int b = 1;
            while (b <= a) {
                System.out.print(b);
                b++;
            }
            System.out.println();
            a++;
        }
    }
}

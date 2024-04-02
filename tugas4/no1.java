/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Masukkan nilai n yang lebih besar dari atau sama dengan 1.");
        } else {
            printAngka(n);
        }

        input.close();
    }

    public static void printAngka(int n) {
        System.out.println("Bilangan dari 1 sampai dengan " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}



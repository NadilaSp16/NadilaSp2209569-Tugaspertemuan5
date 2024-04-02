/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        inputSides();
    }

    public static void inputSides() {
        Scanner input = new Scanner(System.in);
        //sisi segitiga
        System.out.println("Masukkan panjang sisi segitiga:");
        System.out.print("Sisi a: ");
        int a = input.nextInt();
        System.out.print("Sisi b: ");
        int b = input.nextInt();
        System.out.print("Sisi c: ");
        int c = input.nextInt();

        jenisSegitiga(a, b, c);

        input.close();
    }

    public static void jenisSegitiga(int a, int b, int c) {
        //  segitiga menggunakan hukum Pythagoras
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga siku-siku");
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga lancip");
        } else {
            System.out.println("Segitiga tumpul");
        }
    }
}
  


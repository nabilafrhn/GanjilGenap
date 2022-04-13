/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann2;

import java.util.Scanner;

/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class Latihann2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Angka;

        System.out.print("Masukkan angka : ");
        Angka = input.nextInt();

        if (Angka % 2 == 0) { //jika angka dibagi 2 sisa 0 maka bilangan genap
            System.out.println("Bilangan genap");

        } else {
            System.out.println("Bilangan ganjil");
        }
    }

}
    


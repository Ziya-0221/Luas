/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author indi
 */
public class Lingkaran {
    //varibel
    int r= 21,luas;
    
    //menghitung luas lingkaran
    void hitung(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai jari-jari: ");
        r = input.nextInt();
        luas = 22/7*r*r;
        System.out.println("Luas Lingkaran dengan jari-jari "+r+" adalah "+luas);
    }
}

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
public class Persegi {
    //variable
    int s=10,luas;
    
    //menghitung luas persigi
    void hitung(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkkan nilai sisi: ");
        s = input.nextInt();
        luas = s*s; 
        System.out.println("luas persegi dengan sisi "+s+" adalah "+luas);
    }
}

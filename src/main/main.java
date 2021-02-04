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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //input
        Scanner input = new Scanner(System.in);
        
        //user menentukan menu
        System.out.println("Pilih salah satu untuk menghitungnya");
        System.out.println("1. Linkaran");
        System.out.println("2. Persegi");
        System.out.print("pilih: ");
        int pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                //object
                Lingkaran io = new Lingkaran();
                io.hitung();
                break;
            case 2:
                //object
                Persegi in = new Persegi();
                in.hitung();
                break;
    }
    }
    
}

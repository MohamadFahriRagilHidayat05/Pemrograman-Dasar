/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author MARVEL GAME STATION
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Mohamad Fahri Ragil Hidayat");
    Scanner input = new Scanner(System.in);
      
      System.out.println ("Pilihan:");
      System.out.println ("1. Penjumlahan");
      System.out.println ("2. Pengurangan:");
      System.out.println ("3. Perkalian");
      System.out.println ("4. Pembagian");
      System.out.println ("Silahkan ketik untuk memilih");
    
      int menu;
      menu =input.nextInt ();
      
      switch (menu){
          case 1 :
              System.out.println ("Penjumlahan");
              break;
          case 2 :
            System.out.println ("Pengurangan");
          case 3 :
              System.out.println ("Perkalian");
              break;
          case 4 :
              System.out.println ("Pembagian");
              break;
          default :
              System.out.println("Tidak ada pilihan");
      
      }
    }
}

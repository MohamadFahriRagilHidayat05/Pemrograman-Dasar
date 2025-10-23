/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pemrogramandasar;

/**
 *
 * @author MARVEL GAME STATION
 */
public class PemrogramanDasar {

    public static void main(String[] args) {
        System.out.println("Mohamad Fahri Ragil Hidayat");
        int n= 5;
        for (int i = 1; i <=n; i++) {
            for(int j =1; j <= n-i; j++){
                System.out.print(" ");
                
            }
            for(int k=1; k<= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println ();
            
           
              
        }
    }
}
    
    
    
    


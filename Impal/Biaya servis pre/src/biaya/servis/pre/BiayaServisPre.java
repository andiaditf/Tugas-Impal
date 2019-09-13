/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biaya.servis.pre;

import java.util.Scanner;

/**
 *
 * @author Dido
 */
public class BiayaServisPre {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int account = 0;
        int pilihan = 0;
        System.out.print("Account Number :");
        account = in.nextInt();
        if (account == 0){
            System.out.print("Account Tidak Valid");
        }else{
            System.out.print("Invoice : \n 1.Print Invoice");
            pilihan = in.nextInt();
            if ( pilihan == 1){
               System.out.print("Account Number : "+account);
               System.out.print("\n Amount of Sale : ");
            }else{
             System.out.print("Invoice tidak dapat dikeluarkan");
            }
        }
        
    }
}

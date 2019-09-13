/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biaya.servis.structed;
import  java.util.Scanner;
/**
 *
 * @author Dido
 */
public class BiayaServisStructed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int amount;
        int time;
        int biaya = 0;
        //int total = 0;
        System.out.print("Computer-Amount :");
        amount = in.nextInt();
        if (amount == 1 || amount == 2){
            biaya = 50 + 0;
            //System.out.print("Total Biaya :$ "+total);
        }else if (amount == 3 || amount <= 10) {
            biaya = 100 + 10;
            //System.out.print("Total Biaya :$ "+total);
        }else if(amount > 10){
            biaya = 500 + 10;
            //System.out.print("Total Biaya :$ "+total);
        }
        //biaya = total;
        System.out.print("Service-Time : \n 1.Business Hours \n 2.Not Business Hours \n");
        time = in.nextInt();
        if ( time == 1){
             biaya = biaya + 0;
        }else if (time == 2){
            biaya = biaya * 2;
        }
        System.out.print("Customer willing : \n 1.Drop Off and Pick Up \n 2.Delivery \n");
        time = in.nextInt();
        if ( time == 1){
             biaya = biaya / 2;
        }else if (time == 2){
            biaya = biaya + 0;
        }
        System.out.println("Total Biaya :$ "+biaya);
    }
}

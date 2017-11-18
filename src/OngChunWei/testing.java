/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OngChunWei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class testing {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       String restaurantM = null;
       String foodM = null;
       String addressM = null;
       String timeM = null;
       
       System.out.println("Make Schedule");
       System.out.printf("+-------------------------------------------------+");
       System.out.println("|               |                                 |");
       System.out.print("|               |Restaurant:                      |");
                                     restaurantM = scanner.nextLine();
       System.out.println("|     Monday    |Food      :                      |");
       System.out.println("|               |Adress    :                      |");
       System.out.println("|               |Time      :                      |");
       System.out.println("|               |                                 |");
       System.out.println("+-------------------------------------------------+");
    }
    
}

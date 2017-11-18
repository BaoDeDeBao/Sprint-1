/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NgDeBao;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AssignDeliveryman {

    private List<Deliveryman> deliverymanList = new ArrayList<>();
    
    private Scanner username = new Scanner(System.in);
    private Scanner password = new Scanner(System.in);
    private Scanner num2 = new Scanner(System.in);
    private Scanner name = new Scanner(System.in);
    private Scanner order = new Scanner(System.in);
    private Scanner loc = new Scanner(System.in);
    private Scanner dateTime = new Scanner(System.in);
    
    public static void main(String[] args) {
        AssignDeliveryman ass = new AssignDeliveryman();
        ass.input();
        System.out.print(ass.displayRecord());
        ass.input();
    }
    
    public void input() {
        
        String user = "";
        String pass = "";
        
          System.out.print("\nEnter username: ");
          user = username.nextLine();
          System.out.print("Enter password: ");
          pass = password.nextLine();
          
          if(user.equals("staff") && pass.equals("staff")){
              assignDeliveryman();
          }
          else {
              System.out.print("Incorrect username or password !");
              input();
          }
          
    }
    
    public void assignDeliveryman() {
        
        int displayRecord;
        String staffName;
        String jobloc;
        String dT;
        String orderNo;
        
        String[] ID = new String[]{"100","101","102"};
        String[] quantity = new String[]{"2","3","4"};
        
         do{  
            for(int j = 0; j < 3; j++) {
            OrderedItem orderedItem = new OrderedItem(ID[j], quantity[j]); 
            System.out.print(orderedItem.toString());
            }
            
            System.out.println("No 1: assign jobs   No 0: displaying record");
            System.out.println("===========================================");
            System.out.print("Enter any number above: "); 
            displayRecord = num2.nextInt();
            if(displayRecord == 1) {
               System.out.print("Assign deliveryman's name: "); 
               staffName = name.nextLine();
               System.out.print("Assign deliveryman's locatin  to delivery: "); 
               jobloc = loc.nextLine();
               System.out.print("Assign order No: "); 
               orderNo = order.nextLine();
               System.out.print("Assign date and time: "); 
               dT = dateTime.nextLine();
                for (int i = 0; i < ID.length; i++) {
                    if(orderNo.equals(ID[i])) {
                        ID[i] = "finished";
                        quantity[i] = "finished";
                    }
                }
               Deliveryman deliveryman = new Deliveryman(staffName, jobloc, dT);
               deliverymanList.add(deliveryman);
            }
         }while(displayRecord > 0);
         
    }
    public String displayRecord() {
        String outputStr = "";
        for (int i = 0; i < deliverymanList.size(); ++i) {
          outputStr += "\n" + (i + 1) + ". " + deliverymanList.get(i);
        }
        return outputStr;
    }
}

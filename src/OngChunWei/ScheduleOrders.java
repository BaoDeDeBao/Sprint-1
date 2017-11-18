/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OngChunWei;
import OngChunWei.Schedule;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScheduleOrders {
 
    private List<Object> mondayS = new ArrayList<>();
    private List<Object> tuesdayS = new ArrayList<>();
    private List<Object> wednesdayS = new ArrayList<>();
    private List<Object> thursdayS = new ArrayList<>();
    private List<Object> fridayS = new ArrayList<>();
    private String [] restaurantN = new String []{"Sushi King","KFC","Macdonald","Kenny Roger Roster"};
    private Scanner scanner = new Scanner (System.in);
   

    public static void main(String[] args) {
       
        ScheduleOrders menu = new ScheduleOrders();
        menu.mainMenu();
       
        
    }
    
    public void mainMenu(){
        System.out.println("\nMain Menu ");
        System.out.println("1. Make Schedule Orders");
        System.out.println("2. Display Schedule Orders");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            menu();
        }
        else if(choice == 2)
        {
            displaySchedule();
        }    
    }
    
    public void menu(){
        System.out.println("\nMake Schedule Orders: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            mondaySchedule();
        }
        else if(choice == 2)
        {
            tuesdaySchedule();
        }    
        else if(choice == 3)
        {
            wednesdaySchedule();
        }
        else if(choice == 4)
        {
           thursdaySchedule();
        }
        else if(choice == 5)
        {
            fridaySchedule();
        }
        else 
        {
            System.exit(1);
        }
    }
    
    public void mondaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nMonday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        restaurant = scanner.nextLine();
        // fflush(stdin);
        scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        mondayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
       
       
    }
    public void tuesdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nTuesday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        restaurant = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        tuesdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
       
    }
    public void wednesdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nWednesday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        restaurant = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        wednesdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
        
    }
    public void thursdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nThursday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        restaurant = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        thursdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
    }
    public void fridaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nFriday Schedule");
       System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        restaurant = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        fridayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            System.exit(0);
        }
        else
        {
            System.exit(0);
        }
    }
    
    public void displaySchedule(){
        
        if(!mondayS.isEmpty())
        {
            System.out.println("\nMonday Schedule");
            for (int i=0; i< mondayS.size(); i++)
            {
                System.out.printf("%s\n", mondayS.get(i));
            }
        }
        else
        {
            System.out.println("Monday schedule havent set\n");
        }
        
        if(!tuesdayS.isEmpty())
        {
            System.out.println("\nTuesday Schedule");
            for (int i=0; i< tuesdayS.size(); i++)
            {
                System.out.printf("%s\n", tuesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Tuesday schedule havent set\n");
        }
        
        if(!wednesdayS.isEmpty())
        {
            System.out.println("\nWednesday Schedule");
            for (int i=0; i< wednesdayS.size(); i++)
            {
                System.out.printf("%s\n", wednesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Wednesday schedule havent set\n");
        }
        
        if(!thursdayS.isEmpty())
        {
            System.out.println("\nThursday Schedule");
            for (int i=0; i< thursdayS.size(); i++)
            {
                System.out.printf("%s\n", thursdayS.get(i));
            }
        }
        else
        {
            System.out.println("Thursday schedule havent set\n");
        }
        
        if(!fridayS.isEmpty())
        {
            System.out.println("\nFriday Schedule");
            for (int i=0; i< fridayS.size(); i++)
            {
                System.out.printf("%s\n", fridayS.get(i));
            }
        }
        else
        {
            System.out.println("Friday schedule havent set\n");
        }
    }
    
}

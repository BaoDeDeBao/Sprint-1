/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TanWeiJie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class PartB {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int i = 0;
        String newDeliveryName = "";
        String gender;
        String icNo;
        String phoneNo;
        String homeAddress;
        String emergencyContact;
        double salary = 0.0;
        String yesNo;
        
        List<String> listDeliveryName = new ArrayList<String>();
        List<String> listGender = new ArrayList<String>();
        List<String> listIcNo = new ArrayList<String>();
        List<String> listPhoneNo = new ArrayList<String>();
        List<String> listHomeAddress = new ArrayList<String>();
        List<String> listEmergencyContact = new ArrayList<String>();
        List<Double> listSalary = new ArrayList<Double>();
        
        do {   
            System.out.println("\n" + (count + 1) + " Delivery Man");
            System.out.println("==============");
            
            System.out.print("Enter the New Delivery Man Name: ");
            newDeliveryName = scanner.nextLine();

            System.out.print("Enter your gender: ");
            gender = scanner.nextLine();
            
            System.out.print("Enter the IC Number: ");
            icNo = scanner.nextLine();

            System.out.print("Enter the Mobile Phone Number: ");
            phoneNo = scanner.nextLine();

            System.out.print("Enter the home address: ");
            homeAddress = scanner.nextLine();

            System.out.print("Enter the emergency Contact : ");
            emergencyContact = scanner.nextLine();
            
            System.out.print("Enter the salary (RM) : ");
            salary = scanner.nextDouble();
            
            scanner.nextLine();
            
            listDeliveryName.add(newDeliveryName);
            listGender.add(gender);
            listIcNo.add(icNo);
            listPhoneNo.add(phoneNo);
            listHomeAddress.add(homeAddress);
            listEmergencyContact.add(emergencyContact);
            listSalary.add(salary);
            
            count++;
            
            System.out.print("\nDo You want to continue to add new delivery man (yes / no): ");
            yesNo = scanner.nextLine();
 
        }while(yesNo.equals("yes") || yesNo.equals("y"));
        
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("This below are showing that the records your are added");
        
        for (i = 0; i < count; i++) {
            System.out.println("\n==============");
            System.out.println((i + 1) + " delivery man");
            System.out.println("==============");
            System.out.println("Name              : " + listDeliveryName.get(i));
            System.out.println("Gender            : " + listGender.get(i));
            System.out.println("IC No             : " + listIcNo.get(i));
            System.out.println("Phone No          : " + listPhoneNo.get(i));
            System.out.println("Home Address      : " + listHomeAddress.get(i));
            System.out.println("Emergency Contact : " + listEmergencyContact.get(i));
            System.out.printf("Salary (RM)       : %.2f", listSalary.get(i));
        }
        
        System.out.println("\n\nAdd " + i + " number of delivery man Successful!!!");
        
    }
    
}

package com.tnsif.project_2;
import java.util.Scanner;

public class Commission {
	 private String name;
	 private String address;
     private String phone;
     private double salesAmount;
     
     public void acceptDetails() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the name of the employee: ");
         name = scanner.nextLine();
         System.out.print("Enter the address of the employee: ");
         address = scanner.nextLine();
         System.out.print("Enter the phone number of the employee: ");
         phone = scanner.nextLine();
         System.out.print("Enter the sales amount: ");
         salesAmount = scanner.nextDouble();
     }
     public double calculateCommission() {
         double commission = 0.0;
         if (salesAmount > 100000) {
             commission = salesAmount * 0.10;  // 10% commission
         } else if (salesAmount > 50000 && salesAmount <= 100000) {
             commission = salesAmount * 0.05;  // 5% commission
         } else if (salesAmount > 30000 && salesAmount <= 50000) {
             commission = salesAmount * 0.03;  // 3% commission
         } else {
             commission = 0.0;  // No commission
         }
         return commission;
     }
     public void displayDetails() {
         System.out.println("\nEmployee Details:");
         System.out.println("Name: " + name);
         System.out.println("Address: " + address);
         System.out.println("Phone: " + phone);
         System.out.printf("Sales Amount: $%.2f\n", salesAmount);
         System.out.printf("Commission: $%.2f\n", calculateCommission());
     }

}

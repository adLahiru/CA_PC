/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.cse;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SuperSaverPOSGroup_Found404 {
    public static void admin_activiity_options(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your option : ");
        int option = scanner.nextInt();
        switch (option){
            case 1:{
                break;
            }
            case 2:{
                break;
            }
            case 3:{
                break;
            }
            case 4:{
                break;
            }
            case 5:{
                break;
            }
            case 6:{
                System.out.println("Good Bye !");
                System.out.println();
                user_login();
                break;
            }
        }
    }
    public static void admin_activity(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Option : ");
        System.out.println("    1. Add Branch");
        System.out.println("    2. Add Cashiers");
        System.out.println("    3. Add Item Discount");
        System.out.println("    4. Add Items");
        System.out.println("    5. Generate a total revenue report");
        System.out.println("    6. Log out");
        admin_activiity_options();

    }
    public static void user_login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

//        String username = "admin";
//        String password = "admin";
        System.out.println();

        if (username.equals("admin") && password.equals("admin")){
            System.out.println("Hi "+username+" .");
            admin_activity();
        }else{
            System.out.println("Invalid username or password");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Show Welocome message of shop
        String welcome = "Welcome to Found404 Pvt Ltd";
        int display_length = 70;
        for(int i=0;i<display_length;i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i=0;i<(display_length-welcome.length()-2)/2;i++){
            System.out.print(" ");
        }
        System.out.print(welcome);
        for (int i=0;i<(display_length-welcome.length()-2)/2;i++){
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for(int i=0;i<display_length;i++){
            System.out.print("-");
        }
        for (int i=0;i<2;i++){
            System.out.println();
        }
        user_login();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter username : ");
//        String username = scanner.nextLine();
//        System.out.print("Enter password : ");
//        String password = scanner.nextLine();
//
//        String username = "admin";
//        String password = "admin";
//        System.out.println();
//
//        if (username.equals("admin") && password.equals("admin")){
//            System.out.println("Hi "+username+" .");
//            admin_activity();
//        }else{
//            System.out.println("Invalid username or password");
//        }



    }
    
}



    
    
    

    



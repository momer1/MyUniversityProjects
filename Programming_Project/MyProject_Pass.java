package myproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyProject{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BankingSystem myBankingSystems[] = new BankingSystem[2];
        
        int choice = 0;
        while (choice != 5) {
        System.out.println("Press 1 to add client details\nPress 2 to search"
                + "\nPress 3 to update details\nPress 4 to print");
        
        choice = scan.nextInt();
        
            if(choice == 1){
                AddBankingSystem(scan, myBankingSystems);
            }// end first if
        
            if(choice == 2){
                SearchBankingSystem(scan, myBankingSystems);
            }// end second if
        
            if(choice == 3){
                UpdateBankingSystem(scan, myBankingSystems);
            }// end third if
        
            if(choice == 4){
                PrintBankingSystem(scan, myBankingSystems);
            }// end fourth if
        
            else{
                System.out.println("Invalid entry");
            }// end else
        }// end while
    }// end of main method
    
    //=======================
    
    
    public static void AddBankingSystem(Scanner scan, BankingSystem myBankingSystems[]) {
        for(int i = 0; i <myBankingSystems.length; i++) {
            
            
            myBankingSystems[i] = new BankingSystem();
            
            System.out.println("Please type customer's name");
            myBankingSystems[i].name = scan.nextLine();
            scan.nextLine();
            System.out.println("Please type client's age");
            myBankingSystems[i].age = scan.nextInt();
            scan.nextLine();
            System.out.println("Please type client's account number");
            myBankingSystems[i].accountNo = scan.nextInt();
            scan.nextLine();
            System.out.println("Please type client's balance");
            myBankingSystems[i].balance = scan.nextInt();
            scan.nextLine();
        }// end if
    }// 
    
    //-----------------------------------------------------------------------
    
    public static void SearchBankingSystem(Scanner scan,  BankingSystem myBankingSystems[]) {
        
        
        for(int i = 0; i <1; i++) {
            
            System.out.println("What is their name? ");
            String name = scan.nextLine();
            scan.nextLine();
           
            if (myBankingSystems[i].name.equalsIgnoreCase(name)) {
                
                System.out.println("Match found");
            }// end if 
            
            else {
                System.out.println("No match");
            }// end else
                
        }// end for
    }// end of SearchBankingSystem
    

    //-----------------------------------------------------------------------
     
    public static void UpdateBankingSystem(Scanner scan,  BankingSystem myBankingSystems[]){	
        int i=0;
        
        String a = JOptionPane.showInputDialog("What name do you want to update or replace ?");
        String b = JOptionPane.showInputDialog("What is the new name to replace "  + a);
        System.out.println("Existing database" );
   
    
        for( i=0; i<myBankingSystems.length; i++){
            System.out.println( myBankingSystems[i].name);
   	 
    
        System.out.println("=====================\n");
        }// end for loop
     
        for( i=0; i<myBankingSystems.length; i++){
        
            if(myBankingSystems[i].name.equalsIgnoreCase(a)){
                myBankingSystems[i].setName(b);
                JOptionPane.showMessageDialog(null, " you are replacing   " + a + " with " + myBankingSystems[i].name);
                myBankingSystems[i].getName();
            }// if
        }//end second for loop
   
   
        for( i=0; i<myBankingSystems.length; i++){
   	  System.out.println( myBankingSystems[i].name);
        }// end for

    }// end of UpdateBankingSystem

    //-----------------------------------------------------------------------
    
    public static void PrintBankingSystem(Scanner scan, BankingSystem myBankingSystems[]) {
        for(int i = 0; i <myBankingSystems.length; i++) {
            
            
            myBankingSystems[i] = new BankingSystem();
            
            myBankingSystems[i].name = scan.nextLine();
            myBankingSystems[i].age = scan.nextInt();
            myBankingSystems[i].accountNo = scan.nextInt();
            myBankingSystems[i].balance = scan.nextInt();
        }// end for
    }// end of PrintBankingSystem
    
    //-----------------------------------------------------------------------
    
    
}// end of class MyProject 

//====end MyProject=================

//-----------------------------------------------------------------------

//====Database of objects=================

class BankingSystem { // instance variables
    String name;
    int age;
    int accountNo;
    double balance;
    
    
    // default constructor
    
    public BankingSystem(){

        name = " ";
        age = 0;
        accountNo = 0;
        balance = 0.0;
    }// end 
    
    // constructor where user can change values 
    
    public BankingSystem(String nam, int a, int acc, double ba )
    {
        name = nam;
        age = a;
        accountNo = acc;
        balance = ba;
    }// end 
    
    public void printing (){ // this is the print method in the BankingSystem class 
    
        System.out.println(name + " \nName of the client " + age + " \nage of the client " 
                + accountNo + " \nthe account number of the client\n " + balance + " balance of the client ");
    }
    
    public String getName(){
        System.out.println( name + " is in the database\n");
        return name;
    }// end getName
  
    public void setName(String n){
        name = n;
    }// end setName

}  //====end BankingSystem=================
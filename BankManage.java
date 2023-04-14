import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.FontUIResource;

class error extends Exception {
    public String getMessage() {
        return "You Entered Account Number Is Invalid!";
    }
}

class Account {
    private int acc_number;
    private double acc_balance;

    Account(int acc_number, double acc_balance) {
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }

    double get_balance() {
        return acc_balance;
    }

    public void deposite_amount(double dep_amo) {
        acc_balance += dep_amo;
    }

    public boolean withdraw_amount(double with_amo) {
        if (acc_balance >= with_amo) {
            acc_balance -= with_amo;
            return true;
        } else {
            return false;
        }
    }
}

public class BankManage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account arr_obj[] = new Account[999999];

        for (int i = 0; i < 999999; i++) {
            arr_obj[i] = new Account(i, 0);
        }
        double New_account_balance;
try{
        while (true) {
            System.out.println("\n1.Create Account and Deposite Money :");
            System.out.println("\n2.Deposite Money :");
            System.out.println("\n3.Witdraw Money :");
            System.out.println("\n4.View Balance :");
            System.out.println("\n5.Exit :");

            int option = sc.nextInt();

            switch (option) {

                // Case 1 Create Account And Deposite Balance....

                case 1:
                    System.out.println("Create your Account number (5 digit) :");
                    int New_account_Number = sc.nextInt();

                
                        System.out.println("Account Number Created Successfully");

                        System.out.println("Enter Account Balance to Created new Account :");
                        System.out.println("Note Minimum Balance is require 500$");
int bb=499;
                        New_account_balance = sc.nextDouble();

                        if (New_account_balance > bb) {
                            arr_obj[New_account_Number].deposite_amount(New_account_balance);
                            System.out.println("Deposite Balance is Successfully " + New_account_balance);

                        }
                        else 
                        {
                            System.out.println("Your balance is less than 500");
                            System.out.println("Not Deposite...");
                        }

                    

                    break;

                // Case 2 Deposite Balance.....

                case 2:
                    System.out.println("Enter  your Account number(5 digit) :");
                    New_account_Number = sc.nextInt();

                   

                   

                        System.out.println("Enter Account  Balance to Deposite  :");

                        New_account_balance = sc.nextDouble();

                        arr_obj[New_account_Number].deposite_amount(New_account_balance);
                        System.out.println("Deposite Balance is Successfully " + New_account_balance);

                  

                    break;

                // Case 3 WithDraw Money....

                case 3:

                    System.out.println("Enter  your Account number (5 Digit):");
                    New_account_Number = sc.nextInt();

                

                   
                        System.out.println("Enter Withraw Amount :");
                        double with_amo = sc.nextDouble();

                        if (arr_obj[New_account_Number].withdraw_amount(with_amo)) {
                            System.out.println("Deposite Balance is Successfully..");
                            System.out.println("Your New Balance is :" + arr_obj[New_account_Number].get_balance());
                        } else {
                            System.out.println("Inuffucient Balance!");
                        }
                  

                    break;

                // Case 4 View Balance ...

                case 4:

                    System.out.println("enter your Account number (5 Digit) :");
                    New_account_Number = sc.nextInt();

                   

                  

                        System.out.println("Your balance is :" + arr_obj[New_account_Number].get_balance());

                  

                    

                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Choice Valid Option!");
                    break;
            }
        }
    }catch(Exception e)
    {System.out.println("Enter valid!");
    }
}
}
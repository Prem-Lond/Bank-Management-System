import java.util.*;

class BankAccount {
    private int account_number;
    private float balance;

    BankAccount(int account_number, float balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposite(double dep_amount) {
        balance += dep_amount;
    }

    public boolean withDraw(double withDraw_amount) {
        if (balance >= withDraw_amount) {
            balance -= withDraw_amount;
            return true;
        } else {
            return false;
        }
    }

}

public class java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount Bank_Account_obj[] = new BankAccount[999999];

        for (int i = 0; i < 999999; i++) {
            Bank_Account_obj[i] = new BankAccount(i, 0);
        }

        while (true) {
            System.out.println("\n1.Create Account and Deposite Money :");
            System.out.println("\n2.Deposite Money :");
            System.out.println("\n3.Witdraw Money :");
            System.out.println("\n4.View Balance :");
            System.out.println("\n5.Exit :");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("  (Enter Account Number 5 digit ) :");
                    int acc_number = sc.nextInt();

                    int len = (int) (Math.log10(acc_number) + 1);

                    if (len == 5) {
                        System.out.println("Account Number Created Successfully..");

                        System.out.println("\nfirst Account created minimum deposite is :(500)");
                        double first_amount = sc.nextDouble();

                        if (first_amount > 499) {
                            System.out.println("Account  Created Successfully..");

                            // Deposite Balance.....

                            Bank_Account_obj[acc_number].deposite(first_amount);

                            System.out.println("Your Account Number is :" + acc_number);
                            System.out.println("Your Balance is :" + Bank_Account_obj[acc_number].getBalance());

                        }
                    }

                    break;

                case 2:

                    System.out.println("Enter Your Account Number :");
                    acc_number = sc.nextInt();

                    len = (int) (Math.log10(acc_number) + 1);
                    if (len == 5) {
                        System.out.println("Enter Balance to Deposite :");
                        double dep_balance = sc.nextDouble();

                        Bank_Account_obj[acc_number].deposite(dep_balance);

                        System.out.println("Successfully deposite...");
                    } else {
                        System.out.println("Enter valid account number ...");
                    }

                    break;

                case 3:
                    System.out.println("Enter Account number :");
                    acc_number = sc.nextInt();

                    len = (int) (Math.log10(acc_number) + 1);
                    if (len == 5) {

                        System.out.println("Enter Balance for WithDraw :");
                        double withdraw_balance = sc.nextDouble();

                        if (Bank_Account_obj[acc_number].withDraw(withdraw_balance)) {
                            System.out.println("Successfully withraw..." + withdraw_balance + "$");
                        } else {
                            System.out.println("Inuffucient Balance!");
                        }
                    } else {
                        System.out.println("Account number is Invalid....");
                    }

                    break;

                case 4:
                    System.out.println("Enter account number :");
                    acc_number = sc.nextInt();
                    len = (int) (Math.log10(acc_number) + 1);
                    if (len == 5) {

                        System.out.println("Your balance is :" + Bank_Account_obj[acc_number].getBalance());
                    }
            }

        }

    }
}

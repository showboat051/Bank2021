import java.util.Scanner;

public class BankAccount {


    private String custName;
    private int balance;
    private int previousTransaction;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public void init() {
        System.out.println("Hello and Welcome");
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("Press d to deposit funds");
        System.out.println("Press w to withdraw funds");

        String input = scan.nextLine();

        switch(input) {
            case "d":
                deposit();
                break;
            case "w":
                withdraw();
                break;
        }

    } // init()

    public void deposit() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");

        int depositAmt = scanInt.nextInt();
        balance = balance + depositAmt;
        System.out.println("You have deposited " + depositAmt + " dollars");
        System.out.println("Your new balance is " + balance);
        System.out.println("Would you like to make another deposit or withdraw? ");

        String input = scan.nextLine();

        switch(input) {
            case "d":
                deposit();
                break;
            case "w":
                withdraw();
                break;

            case "e":
                break;
        }

    } // deposit()

    static void withdraw() {
        System.out.println("How much would you like to withdraw");
    } // withdraw()






}// end of class

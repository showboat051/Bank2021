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

    static void init() {
        System.out.println("Hello and Welcome");
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do?");

        String input = scan.nextLine();

        if(input.equals("d")){
            deposit();
        } // end of if statement

    } // init()

    static void deposit() {
        System.out.println("the deposit will run here");
    }






}// end of class

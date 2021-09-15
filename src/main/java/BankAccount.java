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

    static void deposit() {

        Scanner scanInt = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");
        int amt = scanInt.nextInt();
        System.out.println("You have deposited " + amt + " dollars");
    } // deposit()

    static void withdraw() {
        System.out.println("How much would you like to withdraw");
    } // withdraw()






}// end of class

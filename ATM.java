package MIB;

public class ATM {

    private String person;
    public static LOGIN login;
    private static double balance = 1000;
    private static double interest = 0.02;
    public static double amount;


    public static void info(String person, double balance, double interest, double amount) {
        balance = 1000;
        balance = balance + login.amountLogin;
        interest = 0.02;
        interest = balance + balance * interest;
        person = person;
        System.out.println(person + " you have a total balance of " + balance + " euros and a total of " + interest + " euros after one year of interest at the actual tax rate.");
    }

    public static double deposit(double amount) {
        balance = balance;
        balance = balance + login.amountLogin;
        System.out.println("Your balance is now " + balance);
        return balance;

    }

    public static double withdraw(double amount) {
        double withdraw = balance - login.amountLogin;
        System.out.println("Your balance is now " + withdraw);
        return withdraw;
    }

}


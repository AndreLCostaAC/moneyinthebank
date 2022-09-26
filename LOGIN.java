package MIB;
import java.util.Scanner;

public class LOGIN {
    private String person;
    private static double balance;
    private static double interest;
    public static double amountLogin;


    public static void login() {
        String startMessage;
        startMessage = "Welcome!";
        System.out.println(startMessage);

        Scanner userInput = new Scanner(System.in);
        String name = "";
        int amountLogin = 0;
        String movement = null;
        int pin = 0;

        System.out.print("Enter your name: ");
        name = userInput.nextLine();

        System.out.print("Enter your Pin: ");
        pin = userInput.nextInt();

        userInput = new Scanner(System.in);

        System.out.print("Do you wanna Withdraw or Deposit?: ");
        movement = userInput.nextLine();

         boolean validInput = false;

             while (!validInput) {
                 if (!movement.equals("deposit") && !movement.equals("withdraw")) {
                     System.out.print("Error, be clear in what operation you wanna do");
                     System.out.println();
                     System.out.print("Do you wanna Withdraw or Deposit?: ");
                     movement = userInput.nextLine();
                 } else {
                     validInput = true;
                 }
             }
             System.out.print("Enter the amount: ");
            amountLogin = userInput.nextInt();
            
    }

}
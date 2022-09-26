package MIB;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {

        LOGIN.login();
        ATM.info("Andre", 1000,0.02, 300);
        ATM.withdraw(200);
    }

}

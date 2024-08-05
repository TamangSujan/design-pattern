package structural.facade.implementation;

import java.util.Scanner;

public class Atm {
    private Atm(){}
    public static double withdraw(AtmCard card){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();
            System.out.print("Enter Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            return AtmDatabase.withdraw(card, pin, amount);
        }
    }
}

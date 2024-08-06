package behaviour.strategy;

import behaviour.strategy.implementation.AddStrategy;
import behaviour.strategy.implementation.Strategy;
import behaviour.strategy.implementation.SubtractStrategy;

import java.util.Scanner;

public class StrategyLauncher {
    public static void main(String[] args) {
        Strategy<Integer, Integer> addStrategy = new AddStrategy();
        Strategy<Integer, Integer> subtractStrategy = new SubtractStrategy();
        try(Scanner scanner = new Scanner(System.in)){
            Integer a;
            Integer b;
            String strategy;
            while(true){
                System.out.print("Enter first number: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter second number: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Type:\n1. ADD - To add numbers\n2. SUB - To subtract numbers");
                strategy = scanner.nextLine();
                switch (strategy){
                    case "ADD":
                        System.out.println(addStrategy.apply(a, b));
                        break;
                    case "SUB":
                        System.out.println(subtractStrategy.apply(a, b));
                        break;
                    default:
                        System.out.println(strategy+" - Unknown");
                }
            }
        }
    }
}

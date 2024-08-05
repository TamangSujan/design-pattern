package structural.facade.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class AtmDatabase {
    private final static Map<String, AtmUser> users = new HashMap<>();
    private AtmDatabase(){}

    public static void addUser(String name){
        users.put(name, new AtmUser(name));
    }

    public static AtmUser getUser(String name){
        return users.get(name);
    }

    public static void save(String name, double balance){
        AtmUser atmUser = users.get(name);
        checkUser(atmUser);
        atmUser.setBalance(atmUser.getBalance() + balance);
    }

    public static double withdraw(AtmCard card, String pin, double amount){
        String user = AtmCardHandler.getUserFromAtmCard(card);
        AtmUser atmUser = users.get(user);
        checkUser(atmUser);
        checkAtmPin(atmUser, pin);
        checkSufficientBalance(atmUser, amount);
        return transaction(atmUser, amount);
    }

    private static void checkUser(AtmUser atmUser){
        if(Objects.isNull(atmUser))
            throw new RuntimeException("No such user!");
    }

    private static void checkAtmPin(AtmUser atmUser, String providedPIN){
        if(!providedPIN.equals(atmUser.getAtmPin())){
            throw new RuntimeException("Invalid PIN!");
        }
    }

    private static void checkSufficientBalance(AtmUser atmUser, double requestedAmount){
        if(requestedAmount > atmUser.getBalance())
            throw new RuntimeException("Insufficient Balance");
    }

    private static double transaction(AtmUser atmUser, double requestedAmount){
        requestedAmount = Math.max(requestedAmount, 0);
        atmUser.setBalance(atmUser.getBalance() - requestedAmount);
        return requestedAmount;
    }
}

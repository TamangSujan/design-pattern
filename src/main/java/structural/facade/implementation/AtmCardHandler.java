package structural.facade.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class AtmCardHandler {
    private AtmCardHandler(){}
    private final static Map<String, String> userAtmNumbers = new HashMap<>();
    public static AtmCard getNewCard(String user, String pin){
        AtmUser atmUser = AtmDatabase.getUser(user);
        if(Objects.isNull(atmUser))
            throw new RuntimeException("Unknown User: " + user);
        String atmUniqueNumber = UUID.randomUUID().toString();
        atmUser.setAtmUniqueNumber(atmUniqueNumber);
        atmUser.setAtmPin(pin);
        userAtmNumbers.put(atmUniqueNumber, user);
        return new AtmCard(atmUniqueNumber);
    }

    public static String getUserFromAtmCard(AtmCard card){
        String user = userAtmNumbers.get(card.getAtmUniqueNumber());
        if(Objects.isNull(user))
            throw new RuntimeException("No such user!");
        return user;
    }
}

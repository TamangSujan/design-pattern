package structural.facade;

import structural.facade.implementation.*;

public class FacadeLauncher {
    public static void main(String[] args) {
        AtmInitializer.loadData();
        AtmCard card = AtmCardHandler.getNewCard("Ram", "1234");
        double receivedMoney = Atm.withdraw(card);
        System.out.println("Received Nrs. "+receivedMoney+" from ATM.");
    }
}

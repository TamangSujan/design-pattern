package behaviour.visitor;

import behaviour.visitor.implementation.*;

public class VisitorLauncher {
    public static void main(String[] args) {
        Visitor sujan = new TaxCollector("Sujan");
        Home ramBungalow = new Bungalow("Ram");
        Home shyamDuplex = new Duplex("Shyam");
        TaxOffice taxOffice = new TaxOffice(sujan);
        taxOffice.add(ramBungalow);
        taxOffice.add(shyamDuplex);
        taxOffice.collectTax();
    }
}

package behaviour.visitor.implementation;

public class TaxCollector implements Visitor{
    private final String name;
    public TaxCollector(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void visitBungalow(Bungalow bungalow) {
        System.out.println(name + " visited "+bungalow.getOwner() + "'s Bungalow.");
    }

    @Override
    public void visitDuplex(Duplex duplex) {
        System.out.println(name + " visited "+duplex.getOwner() + "'s Duplex.");
    }
}

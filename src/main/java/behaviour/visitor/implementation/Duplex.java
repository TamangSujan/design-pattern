package behaviour.visitor.implementation;

public class Duplex implements Home{
    private final String owner;
    public Duplex(String owner){
        this.owner = owner;
    }
    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitDuplex(this);
    }
}

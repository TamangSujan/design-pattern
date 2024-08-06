package behaviour.visitor.implementation;

public class Bungalow implements Home{
    private final String owner;
    public Bungalow(String owner){
        this.owner = owner;
    }
    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitBungalow(this);
    }
}

package behaviour.visitor.implementation;

public interface Home {
    String getOwner();
    void visit(Visitor visitor);
}

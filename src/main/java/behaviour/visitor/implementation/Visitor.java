package behaviour.visitor.implementation;

public interface Visitor {
    String getName();
    void visitBungalow(Bungalow bungalow);
    void visitDuplex(Duplex duplex);
}

package behaviour.mediator.implementation;

public abstract class BComponent {
    final Mediator mediator;
    public BComponent(Mediator mediator){
        this.mediator = mediator;
    }
}

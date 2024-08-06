package behaviour.mediator.implementation;

public class BCheckBox extends BComponent{
    public BCheckBox() {
        super(new GUIMediator());
    }

    public void check(){
        mediator.notify(this, "check");
    }
}

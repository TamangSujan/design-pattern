package behaviour.mediator.implementation;

public class BButton extends BComponent{
    public BButton() {
        super(new GUIMediator());
    }

    public void click(){
        mediator.notify(this, "click");
    }
}

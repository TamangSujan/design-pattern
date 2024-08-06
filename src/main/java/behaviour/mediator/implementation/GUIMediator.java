package behaviour.mediator.implementation;

public class GUIMediator implements Mediator{
    @Override
    public void notify(BComponent component, String action) {
        if(component instanceof BButton && action.equals("click")){
            System.out.println("Button Clicked");
        }
        if(component instanceof BCheckBox && action.equals("check")){
            System.out.println("Check Box Checked");
        }
    }
}

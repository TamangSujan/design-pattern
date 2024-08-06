package behaviour.mediator;

import behaviour.mediator.implementation.BButton;
import behaviour.mediator.implementation.BCheckBox;

public class MediatorLauncher {
    public static void main(String[] args) {
        BButton button = new BButton();
        BCheckBox checkBox = new BCheckBox();
        button.click();
        checkBox.check();
    }
}

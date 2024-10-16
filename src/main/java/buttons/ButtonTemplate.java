package buttons;

import java.util.ArrayList;
import java.util.List;

abstract class ButtonTemplate {
    private String label;
    private boolean buttonValue;
    public ButtonTemplate(String label, boolean buttonValue) {
        this.label = label;
        setButtonValue(buttonValue);
        buttons.add(this);
        listObjects();
    }

    public void setButtonValue(boolean buttonValue) {
        this.buttonValue = buttonValue;
    }

    public boolean getButtonValue() {
        return buttonValue;
    }

    List<ButtonTemplate> buttons = new ArrayList<ButtonTemplate>();
    public void listObjects() {
        for (ButtonTemplate button : buttons) {
            System.out.println("Created button " + button.label);
        }
    }

    public void clickEvent() {
        for (ButtonTemplate button : buttons) {
            if (button != this) {
                button.buttonValue = false;
                System.out.println("Button " + button.label + " clicked " + button.buttonValue);
            }
        }
        this.buttonValue = true;
        System.out.println("Button " + this.label + " clicked " + this.buttonValue);
    }
}

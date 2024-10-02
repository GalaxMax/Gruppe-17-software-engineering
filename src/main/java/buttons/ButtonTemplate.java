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

    public void setButtonValue(boolean butttonValue) {
        this.buttonValue = butttonValue;
    }

    public boolean getButtonValue() {
        return buttonValue;
    }

    List<ButtonTemplate> buttons = new ArrayList<ButtonTemplate>();
    public void listObjects(){
        for (ButtonTemplate button : buttons) {
            System.out.println(button.label);
        }
    }
}

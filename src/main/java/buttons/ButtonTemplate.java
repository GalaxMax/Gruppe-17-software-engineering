package buttons;

import java.util.ArrayList;
import java.util.List;

abstract class ButtonTemplate {
    private String label;
    private int buttonValue;
    public ButtonTemplate(String label, int buttonValue) {
        this.label = label;
        setButtonValue(buttonValue);
        buttons.add(this);
        listObjects();
    }

    public void setButtonValue(int butttonValue) {
        this.buttonValue = butttonValue;
    }

    public int getButtonValue() {
        return buttonValue;
    }

    List<ButtonTemplate> buttons = new ArrayList<ButtonTemplate>();
    public void listObjects(){
        for (ButtonTemplate button : buttons) {
            System.out.println(button.label);
        }
    }
}

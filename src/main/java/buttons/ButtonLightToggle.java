package buttons;

import javax.swing.JPanel;
import java.awt.*;

public class ButtonLightToggle extends ButtonTemplate {
    private JPanel lightID;

    public ButtonLightToggle(String label, int buttonValue, JPanel lightID) {
        super(label, buttonValue);
        this.lightID = lightID;
    }
    public void updateLight(int onOrOff) {
        setButtonValue(onOrOff);
        if (getButtonValue() == 1) {
            lightOn();
        }
        else lightOff();
    }

    private void lightOn() {
        lightID.setBackground(Color.white);
    }
    private void lightOff() {
        lightID.setBackground(Color.black);
    }
}
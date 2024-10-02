package buttons;

import javax.swing.JPanel;
import java.awt.*;

public class ButtonLightToggle extends ButtonTemplate {
    private JPanel lightID;

    public ButtonLightToggle(String label, boolean buttonValue, JPanel lightID) {
        super(label, buttonValue);
        this.lightID = lightID;
    }
    public void updateLight(boolean onOrOff) {
        setButtonValue(onOrOff);
        if (getButtonValue()) {
            lightOn();
            System.out.println("Lights are on!");
        }
        else {
            lightOff();
            System.out.println("Lights are off!");
        }
    }

    private void lightOn() {
        lightID.setBackground(Color.white);
    }
    private void lightOff() {
        lightID.setBackground(Color.black);
    }
}
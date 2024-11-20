package modules;

import javax.swing.*;
import java.awt.*;

public class LampDimmable extends Lamp {
    private int brightness = 0;

    public LampDimmable(String windowName){
        super(windowName);
    }
    public LampDimmable(String windowName, TextModule terminal){  //overloading if terminal access is wanted for the object
        super(windowName, terminal);
    }

    public void setBrightness(int newBrightness) {
        this.brightness = newBrightness;
    }

    public int getBrightness() {
        return this.brightness;
    }

    private void lightUpdate() {
        label.setBackground(new Color(brightness, brightness, brightness));
    }

    public void lightDimUp() {
        if(brightness<=238){
            brightness+=17;
            terminalAccess("Lys dimmet opp");
        }
        if(getState()){
            lightUpdate();
        }
    }

    public void lightDimDown() {
        if(brightness>=17){
            brightness-=17;
            terminalAccess("Lys dimmet ned");
        }
        if(getState()){
            lightUpdate();
        }
    }

    public void lightOn() {
        lightUpdate();
        terminalAccess("Lys på");
        setState(true);
    }
    public void lightOff() {
        label.setBackground(Color.black);
        terminalAccess("Lys av");
        setState(false);
    }
    public void toggleLight() {
        if (this.state) {
            lightOff();
        }
        else lightOn();
    }
}

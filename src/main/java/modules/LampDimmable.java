package modules;

import javax.swing.*;
import java.awt.*;

public class LampDimmable extends ModuleTemplate {

    private int brightness = 0;

    public LampDimmable(String windowName){
        lampOutput(windowName);
    }
    public LampDimmable(String windowName, TextModule terminal){  //Overloading dersom man vil ha en terminal
        super(terminal);
        lampOutput(windowName);
    }

    private void lampOutput(String windowName){
        outputWindow = new JFrame(windowName);
        outputWindow.setSize(400,300);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 75, 200, 150);
        label.setBackground(new Color(brightness, brightness, brightness));
        outputWindow.add(label);

        outputWindow.setVisible(true);
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

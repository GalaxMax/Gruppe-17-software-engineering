package modules;

import javax.swing.*;
import java.awt.*;

public class Lamp extends ModuleTemplate {

    public Lamp(String windowName){
        lampOutput(windowName);
    }
    public Lamp(String windowName, TextModule terminal){  //Overloading dersom man vil ha en terminal
        lampOutput(windowName);
        this.terminal = terminal;
    }

    private void lampOutput(String windowName){
        outputWindow = new JFrame(windowName);
        outputWindow.setSize(400,300);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 150, 600, 250);
        label.setBackground(Color.black);
        outputWindow.add(label);

        outputWindow.setVisible(true);
    }

    public void lightOn() {
        label.setBackground(Color.white);
        setState(true);
    }
    public void lightOff() {
        label.setBackground(Color.black);
        setState(false);
    }
    public void toggleLight() {
        if (this.state) {
            lightOff();
        }
        else lightOn();
    }
}

package modules;

import javax.swing.*;
import java.awt.*;

public class Lamp extends ModuleTemplate {
    public Lamp(String name){
        this.name=name;
        lampOutput(name);
        loadSettings();
        refresh();
    }
    public Lamp(String name, TextModule terminal){  //overloading if terminal access is wanted for the object
        super(terminal);
        this.name=name;
        lampOutput(name);
        loadSettings();
        refresh();
    }

    private void lampOutput(String name){
        outputWindow = new JFrame(name);
        outputWindow.setSize(400,300);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 75, 200, 150);
        label.setBackground(Color.black);
        outputWindow.add(label);

        outputWindow.setVisible(true);
    }

    public void lightOn() {
        label.setBackground(Color.white);
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

    @Override
    protected void refresh(){
        if(getState()) lightOn();
        else lightOff();
    }

}

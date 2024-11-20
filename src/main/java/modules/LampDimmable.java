package modules;

import remotePresets.RemotePresets;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class LampDimmable extends Lamp {
    private int brightness = 0;

    public LampDimmable(String name){
        super(name);
        this.name=name;
        loadSettings();
    }
    public LampDimmable(String name, TextModule terminal){  //overloading if terminal access is wanted for the object
        super(name, terminal);
        this.name=name;
        loadSettings();
    }

//    private void lampOutput(String name){
//        outputWindow = new JFrame(name);
//        outputWindow.setSize(400,300);
//        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        outputWindow.getContentPane().setBackground(Color.black);
//        outputWindow.setLayout(null);
//
//        label = new JPanel();
//        label.setBounds(100, 75, 200, 150);
//        label.setBackground(new Color(brightness, brightness, brightness));
//        outputWindow.add(label);
//
//        outputWindow.setVisible(true);
//    }

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
        if(brightness<=238) brightness+=17;
        else brightness=255;
        terminalAccess("Lys dimmet opp");
        if(getState()){
            lightUpdate();
        }
    }

    public void lightDimDown() {
        if(brightness>=17) brightness-=17;
        else brightness=0;
        terminalAccess("Lys dimmet ned");
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

    @Override
    protected void refresh(){
        if(getState()) lightOn();
        else lightOff();
    }

    @Override
    public void loadSettings(){
        HashMap<String, Integer> savedSettings = RemotePresets.readJSON(this.name);
        System.out.println(savedSettings.get("state"));
        setState(savedSettings.get("state")==1);
        setBrightness(savedSettings.get("brightness"));
    }
}

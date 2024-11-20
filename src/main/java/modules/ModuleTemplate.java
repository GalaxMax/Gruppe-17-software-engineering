package modules;

import remotePresets.RemotePresets;

import javax.swing.*;
import java.util.HashMap;

public abstract class ModuleTemplate {
    protected boolean state = false;
    protected TextModule terminal;

    public String name;
    public JFrame outputWindow;
    public JPanel label;
    public JLabel textLabel;

    ModuleTemplate() {  //constructor if terminal access is not wanted

    }

    ModuleTemplate(TextModule terminal) {   //overloading if terminal access is wanted for the object
        this.terminal = terminal;
    }

    public boolean getState() {
        return state;
    }

    protected void setState(boolean state) {
        this.state = state;
    }

    protected void terminalAccess(String message) {
        try {
            terminal.textLabel.setText(message);
        } catch (Exception e) {
            System.out.println("Ingen terminal er linket.");
        }
    }

    protected void refresh(){
    }

    protected void loadSettings(){
        HashMap<String, Integer> savedSettings = RemotePresets.readJSON(this.name);
        System.out.println(savedSettings.get("state"));
        setState(savedSettings.get("state")==1);
        System.out.println(savedSettings.get("state")==1);
    }
}

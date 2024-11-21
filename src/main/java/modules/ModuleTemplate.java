package modules;

import settingsSaver.SettingsReader;
import settingsSaver.SettingsWriter;

import javax.swing.*;
import java.util.HashMap;

public abstract class ModuleTemplate {
    protected boolean state = false;
    protected TextModule terminal;

    public String name;
    public JFrame outputWindow;
    public JPanel label;
    public JLabel textLabel;
    public HashMap<String, Integer> settings = new HashMap<>();

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

    protected boolean loadSettings(){
        HashMap<String, Integer> savedSettings = SettingsReader.readJSON(this.name);

        if(!savedSettings.isEmpty()) {
            setState(savedSettings.get("state")==1);
            return true;
        }
        else return false;
    }

    protected void saveSettings(){
        settings.put("state", this.state ? 1 : 0);   //quickest way to make boolean into int
        SettingsWriter.writeJSON(this.name, this.settings);
    }

}

package modules;

import settingsSaver.SettingsReader;
import settingsSaver.SettingsWriter;

import java.awt.*;
import java.util.HashMap;

public class LampDimmable extends Lamp {
    private int brightness = 255;

    public LampDimmable(String name){
        super(name);
    }
    public LampDimmable(String name, TextModule terminal){  //overloading if terminal access is wanted for the object
        super(name, terminal);
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
    public boolean loadSettings() {
        HashMap<String, Integer> savedSettings = SettingsReader.readJSON(this.name);
        if (!savedSettings.isEmpty()) {
            setState(savedSettings.get("state") == 1);
            setBrightness(savedSettings.get("brightness"));
            return true;
        }
        else return false;
    }

    @Override
    public void saveSettings(){
        settings.put("state", this.state ? 1 : 0);
        settings.put("brightness", this.brightness);
        SettingsWriter.writeJSON(this.name, this.settings);
    }
}

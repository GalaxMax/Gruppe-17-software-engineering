package profiles;

import modules.ActiveModules;
import java.io.IOException;

public class ProfileOne extends ProfileTemplate{

    public ProfileOne(ActiveModules activeModules) {
        super(activeModules);
        activeModules.textModule.textLabel.setText("Profile switched to Profile One");
    }

    @Override
    public void key1(){
        activeModules.lamp1.toggleLight();
        activeModules.lamp2.toggleLight();
        activeModules.lamp3.toggleLight();
    }

    @Override
    public void key2(){
        activeModules.door1.toggleDoorLock();
    }

    @Override
    public void key3(){
        activeModules.outlet1.toggleOutlet();
    }

    @Override
    public void key4(){
        activeModules.HUElamp1.toggleLight();
    }

    @Override
    public void keyO(){
        activeModules.lamp1.lightOn();
        activeModules.lamp2.lightOn();
        activeModules.lamp3.lightOn();
    }

    @Override
    public void keyF(){
        activeModules.lamp1.lightOff();
        activeModules.lamp2.lightOff();
        activeModules.lamp3.lightOff();
    }

    @Override
    public void keyL(){
        activeModules.door1.doorLock();
    }

    @Override
    public void keyU(){
        activeModules.door1.doorUnlock();
    }

    @Override
    public void keyE(){
        activeModules.outlet1.outletOn();
    }

    @Override
    public void keyS(){
        activeModules.outlet1.outletOff();
    }

    @Override
    public void keyQ(){
        activeModules.HUElamp1.turnOnLight();
    }

    @Override
    public void keyA(){
        activeModules.HUElamp1.turnOffLight();
    }

    @Override
    public void keyArrowUp(){
        activeModules.lamp3.lightDimUp();
    }

    @Override
    public void keyArrowDown(){
        activeModules.lamp3.lightDimDown();
    }

    @Override
    public void keyArrowRight() {
        activeModules.HUElamp1.dimUp();
    }

    @Override
    public void keyArrowLeft() {
        activeModules.HUElamp1.dimDown();
    }
}

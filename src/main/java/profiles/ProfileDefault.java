package profiles;

import modules.ActiveModules;

public class ProfileDefault extends ProfileTemplate{

    public ProfileDefault(ActiveModules activeModules){
        super(activeModules);
        activeModules.textModule.textLabel.setText("Profile switched to Default");
    }

    @Override
    public void key1(){
        activeModules.lamp1.lightOn();
        activeModules.lamp2.lightOn();
        activeModules.lamp3.lightOn();
    }

    @Override
    public void key2(){
        activeModules.lamp1.lightOff();
        activeModules.lamp2.lightOff();
        activeModules.lamp3.lightOff();
    }

    @Override
    public void key3(){
        activeModules.lamp1.toggleLight();
        activeModules.lamp2.toggleLight();
        activeModules.lamp3.toggleLight();
    }

    @Override
    public void key4() {
        activeModules.door1.doorLock();
    }

    @Override
    public void key5(){
        activeModules.door1.doorUnlock();
    }

    @Override
    public void key6(){
        activeModules.door1.toggleDoorLock();
    }

    @Override
    public void key7(){
        activeModules.outlet1.outletOn();
    }

    @Override
    public void key8(){
        activeModules.outlet1.outletOff();
    }

    @Override
    public void key9(){
        activeModules.outlet1.toggleOutlet();
    }

    @Override
    public void keyQ(){
        activeModules.lamp3.lightDimUp();
    }

    @Override
    public void keyW(){
        activeModules.lamp3.lightDimDown();
    }

    @Override
    public void keyE(){
        activeModules.HUElamp1.turnOnLight();
    }

    @Override
    public void keyR(){
        activeModules.HUElamp1.turnOffLight();
    }

    @Override
    public void keyT(){
        activeModules.HUElamp1.toggleLight();
    }

    @Override
    public void keyY() {
        activeModules.HUElamp1.dimUp();
    }

    @Override
    public void keyU() {
        activeModules.HUElamp1.dimDown();
    }
}




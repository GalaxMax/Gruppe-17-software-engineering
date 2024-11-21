package modules;

public class ActiveModules {
    public TextModule textModule = new TextModule("terminal");  //a window is given to each simulated/digital object
    public RemoteControl remoteControl = new RemoteControl("remote");
    public Lamp lamp1 = new Lamp("lamp1", textModule);
    public Lamp lamp2 = new Lamp("lamp2",  textModule);
    public LampDimmable lamp3 = new LampDimmable("lamp3 dimmable", textModule);
    public Door door1= new Door("door1", textModule);
    public Outlet outlet1 = new Outlet("outlet1", textModule);
    public PhilipsHueAPI HUElamp1 = new PhilipsHueAPI("ip", "username", "id", textModule);  //params are unique per person

    public void saveAndClose(){
        lamp1.saveSettings();
        lamp2.saveSettings();
        lamp3.saveSettings();
        outlet1.saveSettings();
        door1.saveSettings();

        lamp1.outputWindow.dispose();
        lamp2.outputWindow.dispose();
        lamp3.outputWindow.dispose();
        outlet1.outputWindow.dispose();
        door1.outputWindow.dispose();

        System.exit(0);
    }
}

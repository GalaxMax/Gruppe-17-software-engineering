package modules;

public class ActiveModules {
    public TextModule textModule = new TextModule("Terminal");
    public RemoteControl remoteControl = new RemoteControl("Fjernkontroll");
    public Lamp lamp1 = new Lamp("Lampe 1", textModule);
    public Lamp lamp2 = new Lamp("Lampe 2");
    public LampDimmable lamp3 = new LampDimmable("Lampe 3", textModule);
    public Door door1= new Door("Dør 1", textModule);
    public Outlet outlet1 = new Outlet("Stikkontakt 1", textModule);
    public PhilipsHueAPI HUElamp1 = new PhilipsHueAPI("ip", "username", "id");  //params are unique per person
}

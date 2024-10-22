package modules;

public class ActiveModules {
    public TextModule textOutput = new TextModule("Hoved-Output");
    public RemoteControl remoteControl = new RemoteControl("Fjernkontroll");
    public Lamp lamp1 = new Lamp("Lampe 1");
    public Lamp lamp2 = new Lamp("Lampe 2");
    public Door door1= new Door("Dør 1");
    public Outlet outlet1 = new Outlet("Stikkontakt 1", textOutput);
}

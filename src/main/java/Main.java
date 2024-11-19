import modules.ActiveModules;
import remotePresets.RemotePresets;

public class Main {
    public static void main(String[] args) {
        ActiveModules IoTSystems = new ActiveModules();
        new SmartInput(IoTSystems);
        RemotePresets test1 = new RemotePresets();
        System.out.println(test1.brightness);
        test1.SaveToJson(60.0, 7.0, 8.0, 9.0, 10.0, 11.0);
    }
}
import modules.ActiveModules;
import remotePresets.RemotePreset_2;

public class Main {
    public static void main(String[] args) {
        ActiveModules IoTSystems = new ActiveModules();
        new SmartInput(IoTSystems);
        RemotePreset_2 test1 = new RemotePreset_2();
        System.out.println(test1.brightness);
    }
}
import modules.ActiveModules;
import remotePresets.RemotePreset_2;
import remotePresets.RemotePresets;

public class Main {
    public static void main(String[] args) {
        ActiveModules IoTSystems = new ActiveModules();
        new SmartInput(IoTSystems);
        RemotePresets test1 = new RemotePresets("src/Main/JSON/RemotePreset_1.json");
        System.out.println(test1.brightness);
        test1.SaveToJson();
    }
}
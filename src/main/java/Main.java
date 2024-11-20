import modules.ActiveModules;
import remotePresets.RemotePresets;

public class Main {
    public static void main(String[] args) {
        ActiveModules IoTSystems = new ActiveModules();
        new SmartInput(IoTSystems);

    }
}
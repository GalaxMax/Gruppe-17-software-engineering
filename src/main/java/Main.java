import remotePresets.RemotePreset_1;
import remotePresets.RemotePreset_2;
import remotePresets.RemotePresets;

public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);
        new PhilipsHueAPI();
        RemotePreset_2 remote = new RemotePreset_2();
        System.out.println(remote.hue);
    }
}
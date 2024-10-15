import remotePresets.RemotePreset_1;

public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);
        new PhilipsHueAPI();
        RemotePreset_1 remote = new RemotePreset_1();
        System.out.println(remote.hue);
    }
}
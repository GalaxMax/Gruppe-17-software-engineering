import remotePresets.*;

public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);
        new PhilipsHueAPI();
        RemotePreset_1 preset_1 = new RemotePreset_1();
        RemotePreset_2 preset_2= new RemotePreset_2();
        System.out.println(preset_1.hue);
        System.out.println(preset_2.hue);
    }
}
import remoteStates.RemoteState_1;

public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);
        new PhilipsHueAPI();
        RemoteState_1 remote = new RemoteState_1();
        System.out.println(remote.hue);
    }
}
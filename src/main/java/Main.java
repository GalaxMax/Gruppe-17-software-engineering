public class Main {
    public static void main(String[] args) {

        IoTDevices IoT = new IoTDevices();


        new SmartInput(IoT.getArrIoTDevices());
    }
}
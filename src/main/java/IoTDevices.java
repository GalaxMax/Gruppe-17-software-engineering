import buttons.ButtonLightToggle;

public class IoTDevices {
    private Object[] arrIoTDevices = new Object[3];
    public IoTDevices() {
        arrIoTDevices[0] = new ButtonLightToggle("Bedroom lights", 1, null);
        arrIoTDevices[1] = new ButtonLightToggle("Living room lights", 1, null);
    }

    public Object[] getArrIoTDevices() {
        return arrIoTDevices;
    }
}

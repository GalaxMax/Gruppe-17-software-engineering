import buttons.ButtonLightToggle;

public class IoTSystem {
    private Object[] arrIoTDevices = new Object[3];
    private ButtonLightToggle[] arrIoTLights = new ButtonLightToggle[3];
    public IoTSystem() {
        arrIoTDevices[0] = 100;
        arrIoTLights[0] = new ButtonLightToggle("Bedroom lights", 1, null);
        arrIoTLights[1] = new ButtonLightToggle("Living room lights", 1, null);
    }

    public Object[] getArrIoTDevices() {
        return arrIoTDevices;
    }
    public ButtonLightToggle[] getArrIoTLights() {
        return arrIoTLights;
    }
}

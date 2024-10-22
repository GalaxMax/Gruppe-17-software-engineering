import buttons.ButtonLightToggle;

public class IoTSystem {
    private final Object[] arrIoTDevices = new Object[1];
    private final ButtonLightToggle[] arrIoTLights = new ButtonLightToggle[2];
    private final PhilipsHueAPI[] arrIoTHUELights = new PhilipsHueAPI[4];

    public IoTSystem() {
        arrIoTLights[0] = new ButtonLightToggle("Bedroom lights", true, null);
        arrIoTLights[1] = new ButtonLightToggle("Living room lights", true, null);

        String username1 = "username";
        String bridgeIp = "ip";
        arrIoTHUELights[0] = new PhilipsHueAPI(bridgeIp, username1, "1");
        arrIoTHUELights[1] = new PhilipsHueAPI(bridgeIp, username1, "2");
        arrIoTHUELights[2] = new PhilipsHueAPI(bridgeIp, username1, "3");
        arrIoTHUELights[3] = new PhilipsHueAPI(bridgeIp, username1, "4");
    }
    public ButtonLightToggle[] getArrIoTLights() {
        return arrIoTLights;
    }
    public PhilipsHueAPI[] getArrIoTHUELights() {
        return arrIoTHUELights;
    }
}

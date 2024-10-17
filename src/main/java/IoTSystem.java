import buttons.ButtonLightToggle;

import javax.swing.*;
import java.awt.*;

public class IoTSystem {

    private final Object[] arrIoTDevices = new Object[1];
    private final ButtonLightToggle[] arrIoTLights = new ButtonLightToggle[2];
    private final PhilipsHueAPI[] arrIoTHUELights = new PhilipsHueAPI[4];

    public IoTSystem() {
        arrIoTLights[0] = new ButtonLightToggle("Bedroom lights", true, null);
        arrIoTLights[1] = new ButtonLightToggle("Living room lights", true, null);

        arrIoTHUELights[0] = new PhilipsHueAPI("ip", "0wFI6Z883zi-...", "1");
        arrIoTHUELights[1] = new PhilipsHueAPI("ip", "0wFI6Z883zi-...", "2");
        arrIoTHUELights[2] = new PhilipsHueAPI("ip", "0wFI6Z883zi-...", "3");
        arrIoTHUELights[3] = new PhilipsHueAPI("ip", "0wFI6Z883zi-...", "4");
    }

    public Object[] getArrIoTDevices() {
        return arrIoTDevices;
    }
    public ButtonLightToggle[] getArrIoTLights() {
        return arrIoTLights;
    }
    public PhilipsHueAPI[] getArrIoTHUELights() {
        return arrIoTHUELights;
    }
}

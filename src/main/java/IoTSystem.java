import buttons.ButtonLightToggle;

import javax.swing.*;
import java.awt.*;

public class IoTSystem {

    private Object[] arrIoTDevices = new Object[3];
    private ButtonLightToggle[] arrIoTLights = new ButtonLightToggle[3];
    private PhilipsHueAPI[] arrIoTHUELights = new PhilipsHueAPI[3];

    public IoTSystem() {
        arrIoTLights[0] = new ButtonLightToggle("Bedroom lights", true, null);
        arrIoTLights[1] = new ButtonLightToggle("Living room lights", true, null);

        PhilipsHueAPI controller = new PhilipsHueAPI("10.0.0.2", "0wFI6Z883zi-LetDWJYkp9yYlR0u7CbgdIJPNEj2", "1");
    }

    public Object[] getArrIoTDevices() {
        return arrIoTDevices;
    }
    public ButtonLightToggle[] getArrIoTLights() {
        return arrIoTLights;
    }
}

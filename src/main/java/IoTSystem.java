import buttons.ButtonLightToggle;

import javax.swing.*;
import java.awt.*;

public class IoTSystem {
    private JPanel tempLight;
    private JFrame FK;
    private Object[] arrIoTDevices = new Object[3];
    private ButtonLightToggle[] arrIoTLights = new ButtonLightToggle[3];
    public IoTSystem() {
        arrIoTDevices[0] = 100;

        FK = new JFrame();
        FK.setSize(800,600);
        FK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FK.getContentPane().setBackground(Color.black);
        FK.setLayout(null);

        tempLight = new JPanel();
        tempLight.setBounds(100, 150, 600, 250);
        tempLight.setBackground(Color.black);
        FK.add(tempLight);

        FK.setVisible(true);

        arrIoTLights[0] = new ButtonLightToggle("Bedroom lights", true, tempLight);
        arrIoTLights[1] = new ButtonLightToggle("Living room lights", true, null);
    }

    public Object[] getArrIoTDevices() {
        return arrIoTDevices;
    }
    public ButtonLightToggle[] getArrIoTLights() {
        return arrIoTLights;
    }
}

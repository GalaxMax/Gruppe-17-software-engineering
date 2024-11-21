package modules;

import javax.swing.*;
import java.awt.*;

public class Lamp extends ModuleTemplate {
    protected JLabel label;
    private ImageIcon lampOffIcon;
    private ImageIcon lampOnIcon;

    public Lamp(String name) {
        this.name = name;
        lampOutput(name);
        if (loadSettings()) refresh();
    }

    public Lamp(String name, TextModule terminal) {
        super(terminal);
        this.name = name;
        lampOutput(name);
        if (loadSettings()) refresh();
    }

    private void lampOutput(String name) {
        lampOffIcon = new ImageIcon(new ImageIcon("src/main/resources/icons/lampOff.png")
                .getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH));
        lampOnIcon = new ImageIcon(new ImageIcon("src/main/resources/icons/lampOn.png")
                .getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH));

        outputWindow = new JFrame(name);
        outputWindow.setSize(400, 300);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.setLayout(null);

        label = new JLabel();
        label.setBounds(100, 75, 200, 150);
        label.setIcon(lampOffIcon);
        outputWindow.add(label);

        outputWindow.setVisible(true);
    }



    public void lightOn() {
        label.setIcon(lampOnIcon);
        terminalAccess("Lys på");
        setState(true);
    }

    public void lightOff() {
        label.setIcon(lampOffIcon);
        terminalAccess("Lys av");
        setState(false);
    }

    public void toggleLight() {
        if (this.state) {
            lightOff();
        } else {
            lightOn();
        }
    }

    @Override
    protected void refresh() {
        if (getState()) lightOn();
        else lightOff();
    }
}

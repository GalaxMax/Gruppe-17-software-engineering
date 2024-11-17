package modules;

import javax.swing.*;
import java.awt.*;

public class Outlet extends ModuleTemplate {
    public Outlet(String windowName){
        outletOutput(windowName);
    }
    public Outlet(String windowName, TextModule terminal){   //overloading if terminal access is wanted for the object
        super(terminal);
        outletOutput(windowName);
    }

    private void outletOutput(String windowName){
        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame(windowName);
        outputWindow.setSize(250,175);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(20, 30, 150, 100);
        label.setBackground(Color.black);
        outputWindow.add(label);

        textLabel = new JLabel();
        textLabel.setBackground(Color.black);
        textLabel.setForeground(Color.white);
        textLabel.setFont(font);
        label.add(textLabel);
        textLabel.setText("Off");

        outputWindow.setVisible(true);
    }

    public void outletOn() {
        textLabel.setText("On");
        terminalAccess("Stikkontakt på");
        setState(true);
    }
    public void outletOff() {
        textLabel.setText("Off");
        terminalAccess("Stikkontakt av");
        setState(false);
    }
    public void toggleOutlet() {
        if (this.state) {
            outletOff();
        }
        else outletOn();
    }
}

package output;

import javax.swing.*;
import java.awt.*;

public class Lamp extends OutputTemplate {

    private boolean state = false;

    public Lamp(){
        lampOutput();
    }

    private void lampOutput(){
        outputWindow = new JFrame();
        outputWindow.setSize(800,600);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 150, 600, 250);
        label.setBackground(Color.black);
        outputWindow.add(label);

        outputWindow.setVisible(true);
    }

    public void lightOn() {
        label.setBackground(Color.white);
    }
    public void lightOff() {
        label.setBackground(Color.black);
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}

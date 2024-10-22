package modules;

import javax.swing.*;
import java.awt.*;

public class Door extends ModuleTemplate {
    public Door(String windowName){
        doorOutput(windowName);
    }

    private void doorOutput(String windowName){
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

        outputWindow.setVisible(true);
    }

    public void doorUnlock() {
        textLabel.setText("Unlocked");
        setState(true);
    }
    public void doorLock() {
        textLabel.setText("Locked");
        setState(false);
    }
}

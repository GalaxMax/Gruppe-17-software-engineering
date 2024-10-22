package modules;

import javax.swing.*;
import java.awt.*;

public class RemoteControl extends ModuleTemplate {

    public RemoteControl(String windowName){
        remoteControlOutput(windowName);
    }

    private void remoteControlOutput(String windowName){
        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame(windowName);
        outputWindow.setSize(600,400);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 150, 500, 250);
        label.setBackground(Color.black);
        label.setLayout(new GridLayout(2,1));
        outputWindow.add(label);

        textLabel = new JLabel();
        textLabel.setBackground(Color.black);
        textLabel.setForeground(Color.white);
        textLabel.setFont(font);
        label.add(textLabel);
        textLabel.setText("Dette er fjernkontrollen. Trykk en knapp!");

        outputWindow.setVisible(true);
    }
}
package output;

import javax.swing.*;
import java.awt.*;

public class RemoteControl extends OutputTemplate {

    public RemoteControl(){
        remoteControlOutput();
    }

    private void remoteControlOutput(){
        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame();
        outputWindow.setSize(800,600);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.black);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 150, 600, 250);
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
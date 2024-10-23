package modules;

import javax.swing.*;
import java.awt.*;

public class TextModule extends ModuleTemplate {
    public TextModule(String windowName){
        textOutput(windowName);
    }

    public void textOutput(String windowName){

        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame(windowName);
        outputWindow.setSize(600,400);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.white);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(50, 75, 400, 250);
        label.setBackground(Color.white);
        label.setLayout(new GridLayout(2,1));
        outputWindow.add(label);

        textLabel = new JLabel();
        textLabel.setBackground(Color.white);
        textLabel.setForeground(Color.black);
        textLabel.setFont(font);
        label.add(textLabel);

        outputWindow.setVisible(true);
    }

}

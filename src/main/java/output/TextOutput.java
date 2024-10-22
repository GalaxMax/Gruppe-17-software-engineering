package output;

import javax.swing.*;
import java.awt.*;

public class TextOutput extends OutputTemplate {
    public TextOutput(String windowName){
        textOutput(windowName);
    }

    public void textOutput(String windowName){

        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame(windowName);
        outputWindow.setSize(400,300);
        outputWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outputWindow.getContentPane().setBackground(Color.white);
        outputWindow.setLayout(null);

        label = new JPanel();
        label.setBounds(100, 150, 600, 250);
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

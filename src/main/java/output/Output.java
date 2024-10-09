package output;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Output {

    public JFrame outPutWindow;
    JPanel panel;
    public JLabel textLabel;

    public Output() {

        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outPutWindow = new JFrame();
        outPutWindow.setSize(800,600);
        outPutWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outPutWindow.getContentPane().setBackground(Color.white);
        outPutWindow.setLayout(null);

        panel = new JPanel();
        panel.setBounds(100, 150, 600, 250);
        panel.setBackground(Color.white);
        panel.setLayout(new GridLayout(2,1));
        outPutWindow.add(panel);

        textLabel = new JLabel();
        textLabel.setBackground(Color.white);
        textLabel.setForeground(Color.black);
        textLabel.setFont(font);
        panel.add(textLabel);

        outPutWindow.setVisible(true);
    }
}

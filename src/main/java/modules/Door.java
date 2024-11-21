package modules;

import javax.swing.*;
import java.awt.*;

public class Door extends ModuleTemplate {
    public Door(String name){
        this.name=name;
        doorOutput(name);
        if(loadSettings()) refresh();
    }
    public Door(String name, TextModule terminal) {   //overloading if terminal access is wanted for the object
        super(terminal);
        this.name=name;
        doorOutput(name);
        if(loadSettings()) refresh();
    }

    private void doorOutput(String name){
        Font font = new Font("Times New Roman", Font.PLAIN, 28);

        outputWindow = new JFrame(name);
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
        textLabel.setText("Locked");

        outputWindow.setVisible(true);
    }

    public void doorUnlock() {
        textLabel.setText("Unlocked");
        terminalAccess("Låste opp døren");
        setState(true);
    }
    public void doorLock() {
        textLabel.setText("Locked");
        terminalAccess("Låste døren");
        setState(false);
    }
    public void toggleDoorLock() {
        if (this.state) {
            doorLock();
        }
        else doorUnlock();
    }

    @Override
    protected void refresh(){
        if(getState()) doorUnlock();
        else doorLock();
    }

}

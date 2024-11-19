package modules;

import javax.swing.*;

public abstract class ModuleTemplate {
    protected boolean state = false;
    protected TextModule terminal;

    public JFrame outputWindow;
    public JPanel label;
    public JLabel textLabel;

    ModuleTemplate() {  //constructor if terminal access is not wanted

    }

    ModuleTemplate(TextModule terminal) {   //overloading if terminal access is wanted for the object
        this.terminal = terminal;
    }

    public boolean getState() {
        return state;
    }

    protected void setState(boolean state) {
        this.state = state;
    }

    protected void terminalAccess(String message) {
        try {
            terminal.textLabel.setText(message);
        } catch (Exception e) {
            System.out.println("Ingen terminal er linket.");
        }
    }
}

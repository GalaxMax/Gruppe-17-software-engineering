package modules;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ModuleTemplate {
    protected boolean state = false;
    protected TextModule terminal;

    public JFrame outputWindow;
    public JPanel label;
    public JLabel textLabel;

    ModuleTemplate() {
        // Overloading dersom man ikke trenger terminal
    }

    ModuleTemplate(TextModule terminal) {
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

package modules;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


abstract class ModuleTemplate {
    protected boolean state = false;
    public JFrame outputWindow;
    public JPanel label;
    public JLabel textLabel;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}

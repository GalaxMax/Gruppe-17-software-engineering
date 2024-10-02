import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Button {
    public String label;
    public boolean butttonValue = false;
    public Button(String label, boolean butttonValue) {
        this.label = label;
        this.butttonValue = butttonValue;
        buttons.add(this);
        listobjects();
    }
    static List<Button> buttons = new ArrayList<Button>();
    public void listobjects(){
        for (Button button : buttons) {
            System.out.println("Created button " + button.label);
        }
    }
    public void clickEvent(){
        for (Button button : buttons) {
            if (button != this) {
                button.butttonValue = false;
                System.out.println("Button " + button.label + " clicked " + button.butttonValue);
            }
        }
        this.butttonValue = true;
        System.out.println("Button " + this.label + " clicked " + this.butttonValue);
    }
    public void releaseEvent(){
        for (Button button : buttons) {
            button.butttonValue = false;
        }
    }
}
class button_light_toggle extends Button {
    public button_light_toggle(String label, boolean butttonValue) {
        super(label, butttonValue);
    }
}
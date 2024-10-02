import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Button {
    public String label;
    public int butttonValue = 0;
    public Button(String label, int butttonValue) {
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
            button.butttonValue = -1;
            System.out.println("Button " + button.label + " clicked " + button.butttonValue);
        }
        this.butttonValue += 2;
        System.out.println("Button " + this.label + " clicked " + this.butttonValue);
    }
}
class button_light_toggle extends Button {
    public button_light_toggle(String label, int butttonValue) {
        super(label, butttonValue);
    }
}
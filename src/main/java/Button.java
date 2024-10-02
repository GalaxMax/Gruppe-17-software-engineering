import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Button {
    private String label;
    private int butttonValue;
    public Button(String label, int butttonValue) {
        this.label = label;
        this.butttonValue = butttonValue;
        buttons.add(this);
        listobjects();
    }
    List<Button> buttons = new ArrayList<Button>();
    public void listobjects(){
        for (Button button : buttons) {
            System.out.println(button.label);
        }
    }
}
class button_light_toggle extends Button {
    public button_light_toggle(String label, int butttonValue) {
        super(label, butttonValue);
    }
}
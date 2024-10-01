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
    }
    List<Button> buttons = new ArrayList<Button>();
    public void listobjects(){
    }
}
class button_light_on extends Button {
    public button_light_on(String label, int butttonValue) {
        super(label, butttonValue);
    }
}
class button_light_off extends Button {
    public button_light_off(String label, int butttonValue) {
        super(label, butttonValue);
    }
}
import java.util.ArrayList;
import java.util.List;

abstract class ButtonTemplate {
    private String label;
    private int butttonValue;
    public ButtonTemplate(String label, int butttonValue) {
        this.label = label;
        this.butttonValue = butttonValue;
        buttons.add(this);
    }
    List<ButtonTemplate> buttons = new ArrayList<ButtonTemplate>();
}

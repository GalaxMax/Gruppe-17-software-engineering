package main.java;

abstract class Button {
    private String label;
    private int butttonValue;
    public Button(String label, int butttonValue) {
        this.label = label;
        this.butttonValue = butttonValue;
    }
}
class button_light_on extends Button {
    public button_light_on(String label, int butttonValue) {
        super(label, butttonValue);
    }
}
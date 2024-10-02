public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);

        //Placeholder buttons
        button_light_toggle buttonLightToggle = new button_light_toggle("yoyo", false);
        button_light_toggle buttonLightToggle2 = new button_light_toggle("jaja", false);
        button_light_toggle buttonLightToggle3 = new button_light_toggle("yeye", false);
        button_light_toggle buttonLightToggle4 = new button_light_toggle("jojo", false);
        buttonLightToggle4.clickEvent();
        buttonLightToggle3.clickEvent();
    }
}
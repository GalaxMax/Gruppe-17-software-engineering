public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new SmartInput();
        Output testOutput = new Output("4096");
        System.out.println(testOutput);
        System.out.println(testOutput.getOutputToInt());
        //Placeholder buttons
        button_light_toggle buttonLightToggle = new button_light_toggle("yoyo", 1);
        button_light_toggle buttonLightToggle2 = new button_light_toggle("jaja", 1);
        button_light_toggle buttonLightToggle3 = new button_light_toggle("yeye", 1);

    }
}
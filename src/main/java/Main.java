import output.ActiveOutputs;

public class Main {
    public static void main(String[] args) {

        ActiveOutputs IoTSystems = new ActiveOutputs();
        new SmartInput(IoTSystems);

        //IoTSystem IoT = new IoTSystem();
        //new SmartInput(IoT);

        //SwingUtilities.invokeLater(() -> {
        //    PhilipsHueAPI controller = new PhilipsHueAPI();
        //    controller.createAndShowGUI(); // Kalle på metoden her
        //});
    }
}
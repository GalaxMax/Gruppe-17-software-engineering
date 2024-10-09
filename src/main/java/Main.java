import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        IoTSystem IoT = new IoTSystem();
        new SmartInput(IoT);

        SwingUtilities.invokeLater(() -> {
            PhilipsHueAPI controller = new PhilipsHueAPI();
            controller.createAndShowGUI(); // Kalle på metoden her
        });
    }
}
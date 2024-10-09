import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueAPI {

    private String bridgeIpAddress = "YOUR_BRIDGE_IP"; // Hue Bridge IP
    private String username = "YOUR_USERNAME"; // Brukernavn
    private String lightID = "1"; // ID-en til lyset
    private boolean lightStatus = false; // Lysstatus (av/på)

    public PhilipsHueAPI() {
        // Start GUI på riktig tråd
        SwingUtilities.invokeLater(this::createAndShowGUI);
    }

    // En metode som sender et HTTP-kall til Hue API for å skru på lyset
    public void turnOnLight() throws IOException {
        sendLightState(true);
    }

    // En metode som sender et HTTP-kall til Hue API for å skru av lyset
    public void turnOffLight() throws IOException {
        sendLightState(false);
    }

    // En metode for å sende lysstatus til API
    private void sendLightState(boolean state) throws IOException {
        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        // Sett lysstatus
        String jsonInputString = "{\"on\": " + state + "}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        // Få responskode for å sjekke om forespørselen var vellykket
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
    }

    // Metode for å oppdatere lysstyrken
    public void setBrightness(int brightness) throws IOException {
        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        // Sett lysstyrke (0-254)
        String jsonInputString = "{\"bri\": " + brightness + "}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        // Få responskode for å sjekke om forespørselen var vellykket
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
    }

    // GUI for å kontrollere lyset
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Philips Hue Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton toggleButton = new JButton("Toggle Light");
        JSlider brightnessSlider = new JSlider(0, 254, 127); // Lysstyrke fra 0 til 254

        // Handlers for knapp og slider
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (lightStatus) {
                        turnOffLight();
                    } else {
                        turnOnLight();
                    }
                    lightStatus = !lightStatus; // Oppdater lysstatus
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        brightnessSlider.addChangeListener(e -> {
            try {
                setBrightness(brightnessSlider.getValue());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        //hehe
        frame.setLayout(new FlowLayout());
        frame.add(toggleButton);
        frame.add(brightnessSlider);
        frame.setVisible(true);
    }

}

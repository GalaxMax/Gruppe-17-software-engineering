import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueAPI {

    private final String bridgeIpAddress;
    private final String username;
    private final String lightID;
    private boolean lightStatus = false; // Lysstatus (av/på)
    private JSlider brightnessSlider; // Slider for lysstyrke

    public PhilipsHueAPI(String bridgeIpAddress, String username, String lightID) {
        this.bridgeIpAddress = bridgeIpAddress;
        this.username = username;
        this.lightID = lightID;
    }

    // En metode som sender et HTTP-kall til Hue API for å skru på lyset
    public void turnOnLight() {
        try {
            sendLightState(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // En metode som sender et HTTP-kall til Hue API for å skru av lyset
    public void turnOffLight() {
        try {
            sendLightState(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void toggleLight() {
        if (lightStatus) {
            turnOffLight();
        } else {
            turnOnLight();
        }
        lightStatus = !lightStatus; // Oppdater lysstatus
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
        brightnessSlider = new JSlider(0, 254, 127); // Lysstyrke fra 0 til 254

        // Handlers for knapp og slider
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lightStatus) {
                    turnOffLight();
                } else {
                    turnOnLight();
                }
                lightStatus = !lightStatus; // Oppdater lysstatus
            }
        });

        brightnessSlider.addChangeListener(e -> {
            try {
                setBrightness(brightnessSlider.getValue());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        // KeyListener for å håndtere piltaster
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    // Øk lysstyrken
                    int newValue = Math.min(brightnessSlider.getValue() + 10, 254); // Maks lysstyrke er 254
                    brightnessSlider.setValue(newValue);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    // Reduser lysstyrken
                    int newValue = Math.max(brightnessSlider.getValue() - 10, 0); // Min lysstyrke er 0
                    brightnessSlider.setValue(newValue);
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(toggleButton);
        frame.add(brightnessSlider);
        frame.setVisible(true);
        frame.setFocusable(true); // Gjør at frame kan få fokus for tastetrykk
        frame.requestFocusInWindow(); // Få fokus med en gang
    }
}

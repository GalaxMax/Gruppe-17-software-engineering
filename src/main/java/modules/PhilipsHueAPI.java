package modules;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueAPI extends ModuleTemplate {

    private final String bridgeIpAddress;
    private final String username;
    private final String lightID;
    private boolean lightStatus = false;
    private JSlider brightnessSlider;
    private int brightness=254;

    public PhilipsHueAPI(String bridgeIpAddress, String username, String lightID) {
        this.bridgeIpAddress = bridgeIpAddress;
        this.username = username;
        this.lightID = lightID;
    }

    public PhilipsHueAPI(String bridgeIpAddress, String username, String lightID, TextModule terminal) {
        super(terminal);
        this.bridgeIpAddress = bridgeIpAddress;
        this.username = username;
        this.lightID = lightID;
    }


    public void turnOnLight() {
        try {
            sendLightState(true);
            terminalAccess("Skrudde på Philips HUE lys");
        } catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
    }

    public void turnOffLight() {
        try {
            sendLightState(false);
            terminalAccess("Skrudde av Philips HUE lys");
        } catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
    }

    public void toggleLight() {
        if (lightStatus) {
            turnOffLight();
        } else {
            turnOnLight();
        }
        lightStatus = !lightStatus; //updates the state
    }

    //sends http call to the Philips Hue API
    private void sendLightState(boolean state) throws IOException {
        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");  //creates connection to Hue API
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        //set state
        String jsonInputString = "{\"on\": " + state + "}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        //get response after try
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
    }

    public void setBrightness(int brightness) throws IOException {
        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        //set brightness (0-254)
        String jsonInputString = "{\"bri\": " + brightness + "}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        //get response after try
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
    }

    public void dimUp() {
        try {
            brightness+=17;
            if(brightness>254) brightness=254;

            setBrightness(brightness);
            terminalAccess("Skrudde opp lysstyrken");
        }
        catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
    }

    public void dimDown() {
        try {
            brightness-=17;
            if(brightness<0) brightness=0;

            terminalAccess("Skrudde ned lysstyrken");
            setBrightness(brightness);
        }
        catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
    }

    //optional gui to control lights
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Philips Hue Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton toggleButton = new JButton("Toggle Light");
        brightnessSlider = new JSlider(0, 254, 127);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lightStatus) {
                    turnOffLight();
                } else {
                    turnOnLight();
                }
                lightStatus = !lightStatus;
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
        frame.setFocusable(true);
    }
}

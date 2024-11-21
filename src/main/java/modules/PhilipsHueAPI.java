package modules;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueAPI extends ModuleTemplate {

    private final String bridgeIpAddress;
    private final String username;
    private final String lightID;
    private int brightness=255;

    public PhilipsHueAPI(String bridgeIpAddress, String username, String lightID, TextModule terminal) {
        super(terminal);
        this.bridgeIpAddress = bridgeIpAddress;
        this.username = username;
        this.lightID = lightID;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void turnOnLight() {
        try {
            terminalAccess("Skrudde på Philips HUE lys");
            return sendLightState(true);
        } catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
        return 0;
    }

    public int turnOffLight() {
        try {
            terminalAccess("Skrudde av Philips HUE lys");
            return sendLightState(false);
        } catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
        return 0;
    }

    public void toggleLight() {
        if (this.state) {
            turnOffLight();
        } else {
            turnOnLight();
        }
        this.state = !this.state; //updates the state
    }

    //sends http call to the Philips Hue API
    private int sendLightState(boolean state) throws IOException {
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
            this.state = state;
        }

        //get response after try
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
        return code;
    }

    public int changeBrightness(int brightness) throws IOException {
        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        //set brightness (0-255)
        String jsonInputString = "{\"bri\": " + brightness + "}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        //get response after try
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
        return code;
    }

    public void dimUp() {
        try {
            brightness+=17;
            if(brightness>255) brightness=255;

            changeBrightness(brightness);
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
            changeBrightness(brightness);
        }
        catch (IOException e) {
            System.out.println("Something went wrong when connecting to HUE lights");
        }
    }
}

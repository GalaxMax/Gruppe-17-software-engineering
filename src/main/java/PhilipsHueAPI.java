import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueAPI {

    // En metode som sender et HTTP-kall til Hue API for å skru på lyset
    public void turnOnLight(String lightID) throws IOException {
        String bridgeIpAddress = ""; // Hue Bridge IP
        String username = ""; // Brukernavn

        URL url = new URL("http://" + bridgeIpAddress + "/api/" + username + "/lights/" + lightID + "/state");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        // Sett lyset til på (true)
        String jsonInputString = "{\"on\": true}";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        // Få responskode for å sjekke om forespørselen var vellykket
        int code = connection.getResponseCode();
        System.out.println("Response Code: " + code);
    }

    public static void main(String[] args) {
        PhilipsHueAPI controller = new PhilipsHueAPI();
        String lightID = "1"; // ID-en til lyset
        try {
            controller.turnOnLight(lightID);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

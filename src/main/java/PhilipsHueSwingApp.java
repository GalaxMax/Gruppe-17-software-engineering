import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhilipsHueSwingApp {

    // PhilipsHueAPI-klasse for å sende HTTP-forespørsler
    static class PhilipsHueAPI {
        public void turnOnLight(String lightID) throws IOException {
            String bridgeIpAddress = "192.168.1.100"; // Eksempel IP-adresse for Hue Bridge
            String username = "yourHueUsername"; // Erstatt med ditt Hue-brukernavn

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
    }

    public static void main(String[] args) {
        // Opprett et vindu (JFrame)
        JFrame frame = new JFrame("Philips Hue Fjernkontroll");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Opprett en knapp (JButton)
        JButton button = new JButton("Skru på lyset");

        // Legg til en lytter (ActionListener) for knappetrykk
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhilipsHueAPI controller = new PhilipsHueAPI();
                String lightID = "1"; // ID-en til lyset
                try {
                    controller.turnOnLight(lightID);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Legg knappen til vinduet
        frame.getContentPane().add(button);

        // Vis vinduet
        frame.setVisible(true);
    }
}

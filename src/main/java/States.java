import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;

public class States {
    public double brightness;
    public double volume;
    public double hue;
    public double saturation;
    public double temperature;
    public double humidity;
    public States(double brightness, double volume, double hue, double saturation, double temperature, double humidity) {
        this.brightness = brightness;
        this.volume = volume;
        this.hue = hue;
        this.saturation = saturation;
        this.temperature = temperature;
        this.humidity = humidity;
        //Will try to read a JSON file and read the contents of the file line by line
        //then add said content to a string with key value pairs which is added to a json object
        //if it can't find the file, it will catch an exception
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Main/JSON/states.json"));
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonContent.toString());
            System.out.println("Brightness: " + jsonObject.getDouble("brightness"));

            /*
            States states = new States((double) jsondata.get("brightness"),100, 100, 100,100, 100);

            System.out.println("Volume: " + states.volume);
            System.out.println("Hue: " + states.hue);
            System.out.println("Saturation: " + states.saturation);
            System.out.println("Temperature: " + states.temperature);
            System.out.println("Humidity: " + states.humidity);

             */
            //System.out.println("Humidity: " + jsondata.getDouble("humidity"));
            reader.close();
            System.out.println("contents " + reader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}

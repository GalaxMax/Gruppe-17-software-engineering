package remotePresets;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//This class will attempt to retrieve data from a .json file and assign the values to the class Remote presets
public class RemotePresets {
    public double brightness;
    public double volume;
    public double hue;
    public double saturation;
    public double temperature;
    public double humidity;
    public String jsonfile;
    public RemotePresets(String jsonFilePath) {
        jsonfile = jsonFilePath;
        ReadJson();
    }
    public RemotePresets() {
        jsonfile = "src/Main/JSON/RemotePreset_1.json";
        ReadJson();
    }
    public void ReadJson() {
        try {
            //Will try to read a JSON file and read the contents of the file line by line
            //then add said content to a string with key value pairs which is added to a json object
            //if it can't find the file, it will catch an exception
            System.out.println("reading file " + jsonfile);
            BufferedReader reader = new BufferedReader(new FileReader(jsonfile));
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JSONObject jsonObject = new JSONObject(jsonContent.toString());
            //closes the reader to save resources
            reader.close();
            //assign the values found in the json to the variables in the object
            this.brightness = jsonObject.getDouble("brightness");
            this.volume = jsonObject.getDouble("volume");
            this.hue = jsonObject.getDouble("hue");
            this.saturation = jsonObject.getDouble("saturation");
            this.temperature = jsonObject.getDouble("temperature");
            this.humidity = jsonObject.getDouble("humidity");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void SaveToJson(Double brightness, Double volume, Double hue, Double saturation, Double temperature, Double humidity) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(jsonfile));
            writer.write("{");
            writer.write("\"brightness\": "+ brightness +",");
            writer.write("\"volume\": "+ volume +",");
            writer.write("\"hue\": "+ hue +",");
            writer.write("\"saturation\": "+ saturation +",");
            writer.write("\"temperature\": " + temperature +",");
            writer.write("\"humidity\": "+ humidity +",");
            writer.write("}");
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

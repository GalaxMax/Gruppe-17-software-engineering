import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;

public abstract class States {
    public double brightness;
    public double volume;
    public double hue;
    public double saturation;
    public double temperature;
    public double humidity;
    public States() {
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
            // closes the reader to save resources
            reader.close();
            //Assign the values found in the json to the variables in the object
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




}

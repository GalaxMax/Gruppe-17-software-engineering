package settingsSaver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


//This class will attempt to retrieve data from a .json file and assign the values to the class Remote presets
public class SettingsReader {

    public static HashMap<String, Integer> readJSON(String unitName) {

        String filePath = "src/Main/JSON/" + unitName + ".json";
        HashMap<String, Integer> savedSettings = new HashMap<>();

        File file = new File(filePath);
        if(file.exists()) {
            try {
                //Will try to read a JSON file and read the contents of the file line by line
                //then format and add said content to a hashmap
                //if it can't find the file, it will catch an exception
                System.out.println("Reading file " + filePath);
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    //Will parse every line following a "tabulate (large white space)" as a key
                    //With an integer value the following ":" after.
                    if (line.startsWith("\"")) {
                        String key;
                        String value;
                        int keyEnd = line.indexOf("\"", 1);
                        int valueStart = line.indexOf(":", keyEnd) + 1;
                        int valueEnd;
                        valueEnd = line.length() - 1;
                        if (!line.endsWith(",")) valueEnd = line.length();

                        key = line.substring(1, keyEnd).trim();
                        value = line.substring(valueStart, valueEnd).trim();

                        savedSettings.put(key, Integer.valueOf(value));
                    }

                }
                //closes the reader to save resources
                reader.close();

            } catch (Exception e) {throw new RuntimeException(e);}
        }
        else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return savedSettings;
    }

}

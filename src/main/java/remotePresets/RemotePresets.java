package remotePresets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


//This class will attempt to retrieve data from a .json file and assign the values to the class Remote presets
public class RemotePresets {

    public static HashMap<String, Integer> readJSON(String unitName) {

        String filePath = "src/Main/JSON/" + unitName + ".json";
        HashMap<String, Integer> savedSettings = new HashMap<String, Integer>();

        try {
            //Will try to read a JSON file and read the contents of the file line by line
            //then format and add said content to a hashmap
            //if it can't find the file, it will catch an exception
            System.out.println("Reading file " + filePath);
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                line=line.trim();
                if (line.startsWith("\"")){
                    String key;
                    String value;
                    int keyEnd=line.indexOf("\"", 1);
                    int valueStart=line.indexOf(":", keyEnd)+1;
                    int valueEnd;
                    valueEnd=line.length()-1;
                    if (!line.endsWith(",")) valueEnd=line.length();

                    key=line.substring(1,keyEnd).trim();
                    value=line.substring(valueStart, valueEnd).trim();

                    savedSettings.put(key, Integer.valueOf(value));
                }
                System.out.println(line);

            }
            //closes the reader to save resources
            reader.close();

            System.out.println(savedSettings);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return savedSettings;
    }

}

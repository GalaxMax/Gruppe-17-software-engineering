package settingsSaver;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class SettingsWriter {

    public static void writeJSON(String unitName, HashMap<String, Integer> settings){

        String filePath="src/Main/JSON/" + unitName + ".json";
        File file = new File(filePath);

        if(file.exists()){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                writer.write("{\n");

                int i=1;
                for(String setting : settings.keySet()){
                    int value=settings.get(setting);

                    writer.write("\"" + setting + "\": " + value);
                    if(i!=settings.size()){
                        writer.write(",");
                    }
                    writer.write("\n");

                    i++;
                }
                writer.write("}");
                writer.close();
            } catch (IOException e) {throw new RuntimeException(e);}
        }
        else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

package settingsSaver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static settingsSaver.SettingsWriter.writeJSON;

public class JsonTest {
    String testFile = "test1";
    //Benytter @BeforeEach for å sørge for at filen lages før den testes
    @BeforeEach
    public void setUp() throws IOException {
        HashMap<String, Integer> jsontest = new HashMap<>();
        jsontest.put("Test1", 1);
        writeJSON(testFile,jsontest);
    }
    @Test
    public void jsontest() {
        assertTrue(Files.exists(Paths.get("src/Main/JSON/" + testFile +".json")));

    }

}
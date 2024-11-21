package settingsSaver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static settingsSaver.SettingsWriter.writeJSON;

public class JsonTest {
    String testFile = "test1";
    String malformedFile = "test2";
    //Benytter @BeforeEach for å sørge for at filenw lages før de testes
    @BeforeEach
    public void setUp() throws IOException {
        HashMap<String, Integer> jsonTest = new HashMap<>();
        HashMap<String, Integer> jsonTestMlformed = new HashMap<>();
        jsonTest.put("Test1", 1);
        jsonTestMlformed.put("Test1,\" : 123", 123);
        writeJSON(testFile,jsonTest);
        writeJSON(malformedFile,jsonTestMlformed);
    }
    @AfterEach
    public void cleanUp() throws IOException {
        Files.deleteIfExists(Paths.get("src/Main/JSON/" + testFile + ".json"));
        Files.deleteIfExists(Paths.get("src/Main/JSON/" + malformedFile + ".json"));
    }
    @Test
    public void jsonCheckIfFileExists() {
        assertTrue(Files.exists(Paths.get("src/Main/JSON/" + testFile +".json")));
        assertTrue(Files.exists(Paths.get("src/Main/JSON/" + malformedFile +".json")));
    }
    @Test
    public void jsonCheckIfFileHasContent() {
        String filePath = "src/Main/JSON/" + testFile +".json";
        boolean fileHasContent;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println(reader.readLine());
            fileHasContent = reader.readLine() != null;
            reader.close();
        } catch (Exception e) {
            fileHasContent = false;
        }
        assertTrue(fileHasContent);
    }
    @Test
    public void jsonCheckFileContents() {
        HashMap testmap = SettingsReader.readJSON(testFile);
        Assertions.assertEquals(1, testmap.get("Test1"));
    }
    @Test
    public void jsonCheckMalformedFile() {
        boolean fileMalformed;
        try {
            HashMap malformedmap = SettingsReader.readJSON(malformedFile);
            fileMalformed = false;
        } catch (Exception e) {
            fileMalformed = true;
        }
        assertTrue(fileMalformed);
    }


}
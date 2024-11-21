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
    String testFile = "test" + System.nanoTime();
    String malformedFile = "maltest" + System.nanoTime();
    //Benytter @BeforeEach for å sørge for at filene lages før hver test.
    @BeforeEach
    public void setUp() throws IOException {
        HashMap<String, Integer> jsonTest = new HashMap<>();
        HashMap<String, Integer> jsonTestMlformed = new HashMap<>();
        jsonTest.put("Test1", 1);
        jsonTestMlformed.put("Test1,\" : 123", 123);
        writeJSON(testFile,jsonTest);
        writeJSON(malformedFile,jsonTestMlformed);
    }
    // Benytter @AfterEach for å slette filer mellom hver test for å opprettholde isolasjon
    @AfterEach
    public void cleanUp() throws IOException {
        try {
            Files.deleteIfExists(Paths.get("src/Main/JSON/" + testFile + ".json"));
            Files.deleteIfExists(Paths.get("src/Main/JSON/" + malformedFile + ".json"));
        } catch (IOException e) {
            System.err.println("Error cleaning up test files: " + e.getMessage());
        }

    }
    //Tester om Jsonfiler eksisterer etter å ha blitt laget
    @Test
    public void jsonCheckIfFileExists() {
        assertTrue(Files.exists(Paths.get("src/Main/JSON/" + testFile +".json")));
        assertTrue(Files.exists(Paths.get("src/Main/JSON/" + malformedFile +".json")));
    }
    //Tester om Jsonfilen har innhold.
    @Test
    public void jsonCheckIfFileHasContent() {
        String filePath = "src/Main/JSON/" + testFile +".json";
        boolean fileHasContent;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            fileHasContent = reader.readLine() != null;
            reader.close();
        } catch (Exception e) {
            fileHasContent = false;
        }
        assertTrue(fileHasContent);
    }
    //Tester om innholdet i JSON filen kan parse til en gyldig HashMap
    @Test
    public void jsonCheckFileContents() {
        HashMap testmap = SettingsReader.readJSON(testFile);
        Assertions.assertEquals(1, testmap.get("Test1"));
    }
    //Tester om en ugyldig Jsonfil gir feil når koden prøver å parse Json til HashMap
    @Test
    public void jsonCheckMalformedFile() {
        boolean fileMalformed;
        try {
            HashMap malformedmap = SettingsReader.readJSON(malformedFile);
            fileMalformed = false;
        } catch (Exception e) {
            fileMalformed = true;
        }
        System.out.println("Accessing file: " + malformedFile + " in " + Thread.currentThread().getName());
        assertTrue(fileMalformed);
    }


}
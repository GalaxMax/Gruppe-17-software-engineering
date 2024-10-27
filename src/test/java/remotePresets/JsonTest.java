package remotePresets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonTest {

    private String validJsonFilePath;
    private String invalidJsonFilePath;

    //Benytter @BeforeEach for å sørge for at filen lages før den testes
    @BeforeEach
    public void setUp() throws IOException {
        validJsonFilePath = "src/Main/JSON/validRemotePresets.json";
        BufferedWriter writer = new BufferedWriter(new FileWriter(validJsonFilePath));
        writer.write("{");
        writer.write("\"brightness\": 255.0,");
        writer.write("\"volume\": 254.0,");
        writer.write("\"hue\": 253.0,");
        writer.write("\"saturation\": 252.0,");
        writer.write("\"temperature\": 251,");
        writer.write("\"humidity\": 250.0");
        writer.write("}");
        writer.close();
        invalidJsonFilePath = "src/Main/JSON/nonExistentFile.json";
    }
    @Test
    public void jsontest() {
        Remote_test remote_test = new Remote_test(validJsonFilePath);
        Assertions.assertEquals(255.0, remote_test.brightness);
        Assertions.assertEquals(254.0, remote_test.volume);
        Assertions.assertEquals(253.0, remote_test.hue);
        Assertions.assertEquals(252.0, remote_test.saturation);
        Assertions.assertEquals(251.0, remote_test.temperature);
        Assertions.assertEquals(250.0, remote_test.humidity);
    }
}
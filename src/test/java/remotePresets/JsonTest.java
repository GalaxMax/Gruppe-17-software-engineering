package remotePresets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Remote_test extends RemotePresets {
    public Remote_test(String jsonfile) {
        super(jsonfile);
    }
}
public class JsonTest {

    private String validJsonFilePath;

    @Test
    public void jsontest() {
        Remote_test remotePreset2_test = new Remote_test(validJsonFilePath);
        //Assertions.assertEquals();
    }
}
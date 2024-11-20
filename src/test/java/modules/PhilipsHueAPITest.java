package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhilipsHueAPITest {
    @Test
    public void successResponseStatusCode() {   //bridgeIpAddress must exist to pass test
        PhilipsHueAPI philipsHueAPITest = new PhilipsHueAPI("xx.x.x.x", "exampleUsername", "2");
        int code = philipsHueAPITest.turnOffLight();
        Assertions.assertEquals(200, code); //code 200 indicates successful HTTP response
    }
}

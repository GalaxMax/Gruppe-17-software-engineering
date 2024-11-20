package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhilipsHueAPITest {    //bridgeIpAddress must exist to pass any test
    @Test
    public void successResponseStatusCode() {
        PhilipsHueAPI philipsHueAPITest = new PhilipsHueAPI("xx.x.x.x", "sampleUsername", "2");
        int code = philipsHueAPITest.turnOnLight();
        Assertions.assertEquals(200, code); //code 200 indicates successful HTTP response
    }

    @Test
    public void failedResponseStatusCode() {
        PhilipsHueAPI philipsHueAPITest = new PhilipsHueAPI("!ANY NON-INTEGER!", "sampleUsername", "2");
        int code = philipsHueAPITest.turnOnLight();
        Assertions.assertEquals(0, code); //code 0 indicates failed HTTP connection
    }

    @Test
    public void hueLightDimUpTest() {  //tests for the dimming limit
        PhilipsHueAPI philipsHueAPITest = new PhilipsHueAPI("xx.x.x.x", "sampleUsername", "2");
        philipsHueAPITest.setBrightness(0);
        for (int i = 0; i < 20; i++) {  //brightness should not go beyond 255, 17*20=340
            philipsHueAPITest.dimUp();
        }
        Assertions.assertEquals(255, philipsHueAPITest.getBrightness());
    }

    @Test
    public void hueLightDimDownTest() {  //tests for the dimming limit
        PhilipsHueAPI philipsHueAPITest = new PhilipsHueAPI("xx.x.x.x", "sampleUsername", "2");
        philipsHueAPITest.setBrightness(255);
        for (int i = 0; i < 20; i++) {  //brightness should not go below 0, -17*20=-340
            philipsHueAPITest.dimDown();
        }
        Assertions.assertEquals(0, philipsHueAPITest.getBrightness());
    }
}

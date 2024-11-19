package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LampDimmableTest {
    @Test
    public void lightDimUpTest() {  //tests for the dimming limit
        LampDimmable lampDimmableTest = new LampDimmable("LampDimTest");
        for (int i = 0; i < 20; i++) {  //brightness should not go beyond 255, 17*20=340
            lampDimmableTest.lightDimUp();
        }
        Assertions.assertEquals(255, lampDimmableTest.getBrightness());
    }
}
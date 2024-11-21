package profiles;

import modules.ActiveModules;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import java.util.Objects;

public class ProfileOneTest {
    ActiveModules activeModules = new ActiveModules();
    ProfileOne profileOne = new ProfileOne(activeModules);

    @Test
    public void test_key1() {
        profileOne.key1();
        Assertions.assertTrue(Objects.equals(activeModules.textModule.textLabel.getText(), "Lys på") || Objects.equals(activeModules.textModule.textLabel.getText(), "Lys av"));
    }

    @Test
    public void test_key2() {
        profileOne.key2();
        Assertions.assertTrue(Objects.equals(activeModules.textModule.textLabel.getText(), "Låste opp døren") || Objects.equals(activeModules.textModule.textLabel.getText(), "Låste døren"));
    }

    @Test
    public void test_key3() {
        profileOne.key3();
        Assertions.assertTrue(Objects.equals(activeModules.textModule.textLabel.getText(), "Stikkontakt på") || Objects.equals(activeModules.textModule.textLabel.getText(), "Stikkontakt av"));
    }

    @Test
    public void test_key4() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        profileOne.key4();
        String printedOutput = outputStream.toString().trim();
        Assertions.assertTrue(Objects.equals(activeModules.textModule.textLabel.getText(), "Skrudde på Philips HUE lys") || Objects.equals(activeModules.textModule.textLabel.getText(), "Skrudde av Philips HUE lys") || Objects.equals(printedOutput, "Something went wrong when connecting to HUE lights"));
        System.setOut(originalOut);
    }

    @Test
    public void test_keyArrowUp() {
        profileOne.keyArrowUp();
        Assertions.assertEquals("Lys dimmet opp", activeModules.textModule.textLabel.getText());
    }
}
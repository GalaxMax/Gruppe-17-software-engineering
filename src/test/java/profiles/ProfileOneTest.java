package profiles;

import modules.ActiveModules;
import modules.TextModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfileOneTest {

    @Test
    public void test_key1() {
        ActiveModules activeModules = new ActiveModules();
        activeModules.textModule = new TextModule("initialText");
        ProfileOne profileOne = new ProfileOne(activeModules);
        profileOne.key1();
        Assertions.assertEquals("Gardiner ned", activeModules.textModule.textLabel.getText());
    }

    @Test
    public void test_key2() {
        ActiveModules activeModules = new ActiveModules();
        activeModules.textModule = new TextModule("initialText");
        ProfileOne profileOne = new ProfileOne(activeModules);
        profileOne.key2();
        Assertions.assertEquals("Gardiner opp", activeModules.textModule.textLabel.getText());
    }

    @Test
    public void test_key3() {
        ActiveModules activeModules = new ActiveModules();
        activeModules.textModule = new TextModule("initialText");
        ProfileOne profileOne = new ProfileOne(activeModules);
        profileOne.key3();
        Assertions.assertEquals("Alarm på", activeModules.textModule.textLabel.getText());
    }

    @Test
    public void test_key4() {
        ActiveModules activeModules = new ActiveModules();
        activeModules.textModule = new TextModule("initialText");
        ProfileOne profileOne = new ProfileOne(activeModules);
        profileOne.key4();
        Assertions.assertEquals("Arlarm av", activeModules.textModule.textLabel.getText());
    }

    @Test
    public void test_key5() {
        ActiveModules activeModules = new ActiveModules();
        activeModules.textModule = new TextModule("initialText");
        ProfileOne profileOne = new ProfileOne(activeModules);
        profileOne.key5();
        Assertions.assertEquals("Detoner selvdestruksjon", activeModules.textModule.textLabel.getText());
    }
}
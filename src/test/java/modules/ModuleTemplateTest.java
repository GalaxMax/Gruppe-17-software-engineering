package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModuleTemplateTest {
    @Test
    public void setStateTestTrue() {
        ModuleTemplate moduleTemplateTest = new Door("moduleTemplateTest"); //ModuleTemplate is abstract, so instead initialize one of the children
        moduleTemplateTest.setState(true);
        Assertions.assertTrue(moduleTemplateTest.state);
    }

    @Test
    public void setStateTestFalse() {
        ModuleTemplate moduleTemplateTest = new Door("moduleTemplateTest"); //ModuleTemplate is abstract, so instead initialize one of the children
        moduleTemplateTest.setState(false);
        Assertions.assertFalse(moduleTemplateTest.state);
    }
}

package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoorTest {
    @Test
    public void doorUnlock() {
        Door door = new Door("DoorTest");
        door.doorUnlock();
        Assertions.assertTrue(door.state);
    }

    @Test
    public void doorLock() {
        Door door = new Door("DoorTest");
        door.doorLock();
        Assertions.assertFalse(door.state);
    }

}

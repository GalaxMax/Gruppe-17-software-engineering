package profiles;

import modules.ActiveModules;

import java.io.IOException;

public class ProfileTwo extends ProfileTemplate{

    public ProfileTwo(ActiveModules activeModules) {
        super(activeModules);
        activeModules.textModule.textLabel.setText("Profile switched to Profile Two");
    }
}

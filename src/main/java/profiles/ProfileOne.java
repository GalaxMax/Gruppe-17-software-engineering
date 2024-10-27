package profiles;
import modules.ActiveModules;

public class ProfileOne extends ProfileDefault{
    public ProfileOne(ActiveModules activeModules) {
        super(activeModules);
    }

    @Override
    public void key1(){
        activeModules.textOutput.textLabel.setText("Gardiner ned");
    }

    @Override
    public void key2(){
        activeModules.textOutput.textLabel.setText("Gardiner opp");
    }

    @Override
    public void key3(){
        activeModules.textOutput.textLabel.setText("Alarm på");
    }

    @Override
    public void key4(){
        activeModules.textOutput.textLabel.setText("Arlarm av");
    }

    @Override
    public void key5(){
        activeModules.textOutput.textLabel.setText("Detoner selvdestruksjon");
    }


}

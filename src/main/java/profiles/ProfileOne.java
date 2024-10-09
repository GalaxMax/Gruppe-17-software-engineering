package profiles;
import output.ActiveOutputs;

public class ProfileOne extends ProfileDefault{
    public ProfileOne(ActiveOutputs activeOutputs) {
        super(activeOutputs);
    }

    @Override
    public void key1(){
        activeOutputs.mainOutput.textLabel.setText("Gardiner ned");
    }

    @Override
    public void key2(){
        activeOutputs.mainOutput.textLabel.setText("Gardiner opp");
    }

    @Override
    public void key3(){
        activeOutputs.mainOutput.textLabel.setText("Alarm på");
    }

    @Override
    public void key4(){
        activeOutputs.mainOutput.textLabel.setText("Arlarm av");
    }

    @Override
    public void key5(){
        activeOutputs.mainOutput.textLabel.setText("Detoner selvdestruksjon");
    }


}

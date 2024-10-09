package profiles;
import output.Output;

public class ProfileOne extends ProfileDefault{
    public ProfileOne(Output window) {
        super(window);
    }

    @Override
    public void key1(){
        window.textLabel.setText("Gardiner ned");
    }

    @Override
    public void key2(){
        window.textLabel.setText("Gardiner opp");
    }

    @Override
    public void key3(){
        window.textLabel.setText("Alarm på");
    }

    @Override
    public void key4(){
        window.textLabel.setText("Arlarm av");
    }

    @Override
    public void key5(){
        window.textLabel.setText("Detoner selvdestruksjon");
    }


}

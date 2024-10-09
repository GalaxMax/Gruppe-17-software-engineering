package profiles;

import output.Output;

public class DefaultProfile {

    private Output window;

    public DefaultProfile(Output window){
    this.window=window;
    }
    public void arrowLeft(){
        window.textLabel.setText("Det var venstre, gitt!");
    }

    public void arrowRight(){
        window.textLabel.setText("Rop det høyre!");
    }

    public void keyA(){
        window.textLabel.setText("AAAAAAAAAAAAAAAAAA");
    }

    public void keyC(){
        window.textLabel.setText("C der ja!");
    }

}




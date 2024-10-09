package profiles;

import output.Output;

public class ProfileDefault {

    protected Output window;

    public ProfileDefault(Output window){
    this.window=window;
    }

    public void arrowUp(){
        window.textLabel.setText("Opp");
    }

    public void arrowDown(){
        window.textLabel.setText("Ned");
    }

    public void arrowLeft(){
        window.textLabel.setText("Venstre");
    }

    public void arrowRight(){
        window.textLabel.setText("Høyre");
    }

    public void key1(){
        window.textLabel.setText("Mute/Unmute");
    }

    public void key2(){
        window.textLabel.setText("Lyd opp");
    }

    public void key3(){
        window.textLabel.setText("Lyd ned");
    }

    public void key4(){
        window.textLabel.setText("Lys av/på");
    }

    public void key5(){
        window.textLabel.setText("Lys dim opp");
    }

    public void key6(){
        window.textLabel.setText("Lys dim ned");
    }

    public void key7(){
        window.textLabel.setText("Lås/lås opp huset");
    }

    public void key8(){
        window.textLabel.setText("Åpne/lukke garasjedøra");
    }

    public void key9(){
        window.textLabel.setText("Varm bilen");
    }

    public void key0(){
        window.textLabel.setText("Start kaffemaskina");
    }

    public void keyQ(){
        window.textLabel.setText("Home-knapp");
    }

    public void keyW(){
        window.textLabel.setText("OK-knapp");
    }

    public void keyE(){
        window.textLabel.setText("Tilbake-knapp");
    }

    public void keyR(){
        window.textLabel.setText("Info-knapp");
    }

    public void keyT(){
        window.textLabel.setText("Exit-knapp");
    }

    public void keyY(){
        window.textLabel.setText("Skru-av-knapp");
    }

    public void keyBackSpace(){
        window.outPutWindow.dispose();
    }

    public void keyU(){
        window.textLabel.setText("U");
    }

    public void keyI(){
        window.textLabel.setText("I");
    }

    public void keyO(){
        window.textLabel.setText("O");
    }

    public void keyP(){
        window.textLabel.setText("P");
    }

    public void keyA(){
        window.textLabel.setText("A");
    }

    public void keyS(){
        window.textLabel.setText("S");
    }

    public void keyD(){
        window.textLabel.setText("d");
    }

    public void keyF(){
        window.textLabel.setText("F");
    }

    public void keyG(){
        window.textLabel.setText("G");
    }

    public void keyH(){
        window.textLabel.setText("H");
    }

    public void keyJ(){
        window.textLabel.setText("J");
    }

    public void keyK(){
        window.textLabel.setText("K");
    }

    public void keyL(){
        window.textLabel.setText("L");
    }

    public void keyZ(){
        window.textLabel.setText("Z");
    }

    public void keyX(){
        window.textLabel.setText("X");
    }

    public void keyC(){
        window.textLabel.setText("C");
    }

    public void keyV(){
        window.textLabel.setText("V");
    }

    public void keyB(){
        window.textLabel.setText("B");
    }

    public void keyN(){
        window.textLabel.setText("N");
    }

    public void keyM(){
        window.textLabel.setText("M");
    }
}




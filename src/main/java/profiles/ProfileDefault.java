package profiles;

import output.ActiveOutputs;

public class ProfileDefault {
    public int tall=0;
    protected ActiveOutputs activeOutputs;

    public ProfileDefault(ActiveOutputs activeOutputs){
    this.activeOutputs=activeOutputs;
    }

    public void arrowUp(){
        activeOutputs.mainOutput.textLabel.setText("Opp");
    }

    public void arrowDown(){
        activeOutputs.mainOutput.textLabel.setText("Ned");
    }

    public void arrowLeft(){
        activeOutputs.mainOutput.textLabel.setText("Venstre");
    }

    public void arrowRight(){
        activeOutputs.mainOutput.textLabel.setText("Høyre");
    }

    public void key1(){
        activeOutputs.mainOutput.textLabel.setText(Integer.toString(tall));
        tall+=1;
    }

    public void key2(){
        activeOutputs.mainOutput.textLabel.setText(Integer.toString(tall));
        tall-=1;
    }

    public void key3(){
        activeOutputs.mainOutput.textLabel.setText("Lyd ned");
    }

    public void key4(){
        activeOutputs.mainOutput.textLabel.setText("Lys av/på");
        if(activeOutputs.lamp1.getState()==false){
            activeOutputs.lamp1.lightOn();
            activeOutputs.lamp1.setState(true);
        }
        else{
            activeOutputs.lamp1.lightOff();
            activeOutputs.lamp1.setState(false);
        }

    }

    public void key5(){
        activeOutputs.mainOutput.textLabel.setText("Lys dim opp");
    }

    public void key6(){
        activeOutputs.mainOutput.textLabel.setText("Lys dim ned");
    }

    public void key7(){
        activeOutputs.mainOutput.textLabel.setText("Lås/lås opp huset");
    }

    public void key8(){
        activeOutputs.mainOutput.textLabel.setText("Åpne/lukke garasjedøra");
    }

    public void key9(){
        activeOutputs.mainOutput.textLabel.setText("Varm bilen");
    }

    public void key0(){
        activeOutputs.mainOutput.textLabel.setText("Start kaffemaskina");
    }

    public void keyQ(){
        activeOutputs.mainOutput.textLabel.setText("Home-knapp");
    }

    public void keyW(){
        activeOutputs.mainOutput.textLabel.setText("OK-knapp");
    }

    public void keyE(){
        activeOutputs.mainOutput.textLabel.setText("Tilbake-knapp");
    }

    public void keyR(){
        activeOutputs.mainOutput.textLabel.setText("Info-knapp");
    }

    public void keyT(){
        activeOutputs.mainOutput.textLabel.setText("Exit-knapp");
    }

    public void keyY(){
        activeOutputs.mainOutput.textLabel.setText("Skru-av-knapp");
    }

    public void keyBackSpace(){
        activeOutputs.mainOutput.outputWindow.dispose();
    }

    public void keyU(){
        activeOutputs.mainOutput.textLabel.setText("U");
    }

    public void keyI(){
        activeOutputs.mainOutput.textLabel.setText("I");
    }

    public void keyO(){
        activeOutputs.mainOutput.textLabel.setText("O");
    }

    public void keyP(){
        activeOutputs.mainOutput.textLabel.setText("P");
    }

    public void keyA(){
        activeOutputs.mainOutput.textLabel.setText("A");
    }

    public void keyS(){
        activeOutputs.mainOutput.textLabel.setText("S");
    }

    public void keyD(){
        activeOutputs.mainOutput.textLabel.setText("d");
    }

    public void keyF(){
        activeOutputs.mainOutput.textLabel.setText("F");
    }

    public void keyG(){
        activeOutputs.mainOutput.textLabel.setText("G");
    }

    public void keyH(){
        activeOutputs.mainOutput.textLabel.setText("H");
    }

    public void keyJ(){
        activeOutputs.mainOutput.textLabel.setText("J");
    }

    public void keyK(){
        activeOutputs.mainOutput.textLabel.setText("K");
    }

    public void keyL(){
        activeOutputs.mainOutput.textLabel.setText("L");
    }

    public void keyZ(){
        activeOutputs.mainOutput.textLabel.setText("Z");
    }

    public void keyX(){
        activeOutputs.mainOutput.textLabel.setText("X");
    }

    public void keyC(){
        activeOutputs.mainOutput.textLabel.setText("C");
    }

    public void keyV(){
        activeOutputs.mainOutput.textLabel.setText("V");
    }

    public void keyB(){
        activeOutputs.mainOutput.textLabel.setText("B");
    }

    public void keyN(){
        activeOutputs.mainOutput.textLabel.setText("N");
    }

    public void keyM(){
        activeOutputs.mainOutput.textLabel.setText("M");
    }
}




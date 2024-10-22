package profiles;

import output.ActiveOutputs;

public class ProfileDefault {
    public int tall=0;
    protected ActiveOutputs activeOutputs;

    public ProfileDefault(ActiveOutputs activeOutputs){
    this.activeOutputs=activeOutputs;
    }

    public void unnassigned(){
        activeOutputs.textOutput.textLabel.setText("This key is unnasigned.");
    }

    public void arrowUp(){
        activeOutputs.textOutput.textLabel.setText("Opp");
    }

    public void arrowDown(){
        activeOutputs.textOutput.textLabel.setText("Ned");
    }

    public void arrowLeft(){
        activeOutputs.textOutput.textLabel.setText("Venstre");
    }

    public void arrowRight(){
        activeOutputs.textOutput.textLabel.setText("Høyre");
    }

    public void key1(){
        tall+=1;
        activeOutputs.textOutput.textLabel.setText(Integer.toString(tall));
    }

    public void key2(){
        tall-=1;
        activeOutputs.textOutput.textLabel.setText(Integer.toString(tall));
    }

    public void key3(){
        activeOutputs.textOutput.textLabel.setText("Lyd ned");
    }

    public void key4(){
        if(activeOutputs.lamp1.getState()){
            activeOutputs.lamp1.lightOff();
            activeOutputs.textOutput.textLabel.setText("Lys av");
        }
        else{
            activeOutputs.lamp1.lightOn();
            activeOutputs.textOutput.textLabel.setText("Lys på");
        }

    }

    public void key5(){
        activeOutputs.textOutput.textLabel.setText("Lys dim opp");
    }

    public void key6(){
        activeOutputs.textOutput.textLabel.setText("Lys dim ned");
    }

    public void key7(){
        if(activeOutputs.door1.getState()){
            activeOutputs.door1.doorLock();
            activeOutputs.textOutput.textLabel.setText("Dør låst");
        }
        else{
            activeOutputs.door1.doorUnlock();
            activeOutputs.textOutput.textLabel.setText("Dør ulåst");
        }
    }

    public void key8(){
        activeOutputs.textOutput.textLabel.setText("Åpne/lukke garasjedøra");
    }

    public void key9(){
        activeOutputs.textOutput.textLabel.setText("Varm bilen");
    }

    public void key0(){
        activeOutputs.textOutput.textLabel.setText("Start kaffemaskina");
    }

    public void keyQ(){
        activeOutputs.textOutput.textLabel.setText("Home-knapp");
    }

    public void keyW(){
        activeOutputs.textOutput.textLabel.setText("OK-knapp");
    }

    public void keyE(){
        activeOutputs.textOutput.textLabel.setText("Tilbake-knapp");
    }

    public void keyR(){
        activeOutputs.textOutput.textLabel.setText("Info-knapp");
    }

    public void keyT(){
        activeOutputs.textOutput.textLabel.setText("Exit-knapp");
    }

    public void keyY(){
        activeOutputs.textOutput.textLabel.setText("Skru-av-knapp");
    }

    public void keyBackSpace(){
        activeOutputs.textOutput.textLabel.setText("Lukker vindu");
        activeOutputs.textOutput.outputWindow.dispose();
    }

    public void keyU(){
        activeOutputs.outlet1.outletOn();
        activeOutputs.textOutput.textLabel.setText("Stikkontakt på");
    }

    public void keyI(){
        activeOutputs.outlet1.outletOff();
        activeOutputs.textOutput.textLabel.setText("Stikkontakt av");
    }

    public void keyO(){
        activeOutputs.textOutput.textLabel.setText("O");
    }

    public void keyP(){
        activeOutputs.textOutput.textLabel.setText("P");
    }

    public void keyA(){
        activeOutputs.textOutput.textLabel.setText("A");
    }

    public void keyS(){
        activeOutputs.textOutput.textLabel.setText("S");
    }

    public void keyD(){
        activeOutputs.textOutput.textLabel.setText("d");
    }

    public void keyF(){
        activeOutputs.textOutput.textLabel.setText("F");
    }

    public void keyG(){
        activeOutputs.textOutput.textLabel.setText("G");
    }

    public void keyH(){
        activeOutputs.textOutput.textLabel.setText("H");
    }

    public void keyJ(){
        activeOutputs.textOutput.textLabel.setText("J");
    }

    public void keyK(){
        activeOutputs.textOutput.textLabel.setText("K");
    }

    public void keyL(){
        activeOutputs.textOutput.textLabel.setText("L");
    }

    public void keyZ(){
        activeOutputs.textOutput.textLabel.setText("Z");
    }

    public void keyX(){
        activeOutputs.textOutput.textLabel.setText("X");
    }

    public void keyC(){
        activeOutputs.textOutput.textLabel.setText("C");
    }

    public void keyV(){
        activeOutputs.textOutput.textLabel.setText("V");
    }

    public void keyB(){
        activeOutputs.textOutput.textLabel.setText("B");
    }

    public void keyN(){
        activeOutputs.textOutput.textLabel.setText("N");
    }

    public void keyM(){
        activeOutputs.textOutput.textLabel.setText("M");
    }
}




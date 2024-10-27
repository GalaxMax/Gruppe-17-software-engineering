package profiles;

import modules.ActiveModules;

public class ProfileDefault {
    public int tall=0;
    protected ActiveModules activeModules;

    public ProfileDefault(ActiveModules activeModules){
    this.activeModules = activeModules;
    }

    public void unnassigned(){
        activeModules.textOutput.textLabel.setText("This key is unnasigned.");
    }

    public void arrowUp(){
        activeModules.textOutput.textLabel.setText("Opp");
    }

    public void arrowDown(){
        activeModules.textOutput.textLabel.setText("Ned");
    }

    public void arrowLeft(){
        activeModules.textOutput.textLabel.setText("Venstre");
    }

    public void arrowRight(){
        activeModules.textOutput.textLabel.setText("Høyre");
    }

    public void key1(){
        tall+=1;
        activeModules.textOutput.textLabel.setText(Integer.toString(tall));
    }

    public void key2(){
        tall-=1;
        activeModules.textOutput.textLabel.setText(Integer.toString(tall));
    }

    public void key3(){
        activeModules.lamp2.toggleLight();
    }

    public void key4() {
        activeModules.lamp1.toggleLight();
    }

    public void key5(){
        activeModules.textOutput.textLabel.setText("Lys dim opp");
    }

    public void key6(){
        activeModules.textOutput.textLabel.setText("Lys dim ned");
    }

    public void key7(){
        activeModules.door1.toggleDoorLock();
    }

    public void key8(){
        activeModules.textOutput.textLabel.setText("Åpne/lukke garasjedøra");
    }

    public void key9(){
        activeModules.textOutput.textLabel.setText("Varm bilen");
    }

    public void key0(){
        activeModules.textOutput.textLabel.setText("Start kaffemaskina");
    }

    public void keyQ(){
        activeModules.textOutput.textLabel.setText("Home-knapp");
    }

    public void keyW(){
        activeModules.textOutput.textLabel.setText("OK-knapp");
    }

    public void keyE(){
        activeModules.textOutput.textLabel.setText("Tilbake-knapp");
    }

    public void keyR(){
        activeModules.textOutput.textLabel.setText("Info-knapp");
    }

    public void keyT(){
        activeModules.textOutput.textLabel.setText("Exit-knapp");
    }

    public void keyY(){
        activeModules.textOutput.textLabel.setText("Skru-av-knapp");
    }

    public void keyBackSpace(){
        activeModules.textOutput.textLabel.setText("Lukker vindu");
        activeModules.textOutput.outputWindow.dispose();
    }

    public void keyU(){
        activeModules.outlet1.toggleOutlet();
    }

    public void keyI(){

    }

    public void keyO(){
        activeModules.textOutput.textLabel.setText("O");
    }

    public void keyP(){
        activeModules.textOutput.textLabel.setText("P");
    }

    public void keyA(){
        activeModules.textOutput.textLabel.setText("A");
    }

    public void keyS(){
        activeModules.textOutput.textLabel.setText("S");
    }

    public void keyD(){
        activeModules.textOutput.textLabel.setText("d");
    }

    public void keyF(){
        activeModules.textOutput.textLabel.setText("F");
    }

    public void keyG(){
        activeModules.textOutput.textLabel.setText("G");
    }

    public void keyH(){
        activeModules.textOutput.textLabel.setText("H");
    }

    public void keyJ(){
        activeModules.textOutput.textLabel.setText("J");
    }

    public void keyK(){
        activeModules.textOutput.textLabel.setText("K");
    }

    public void keyL(){
        activeModules.textOutput.textLabel.setText("L");
    }

    public void keyZ(){
        activeModules.textOutput.textLabel.setText("Z");
    }

    public void keyX(){
        activeModules.textOutput.textLabel.setText("X");
    }

    public void keyC(){
        activeModules.textOutput.textLabel.setText("C");
    }

    public void keyV(){
        activeModules.textOutput.textLabel.setText("V");
    }

    public void keyB(){
        activeModules.textOutput.textLabel.setText("B");
    }

    public void keyN(){
        activeModules.textOutput.textLabel.setText("N");
    }

    public void keyM(){
        activeModules.textOutput.textLabel.setText("M");
    }
}




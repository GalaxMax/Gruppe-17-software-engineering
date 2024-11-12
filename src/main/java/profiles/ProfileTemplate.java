package profiles;

import modules.ActiveModules;

public class ProfileTemplate {
    protected ActiveModules activeModules;

    public ProfileTemplate(ActiveModules activeModules){
        this.activeModules = activeModules;
    }

    public void profileCycle(){
        activeModules.textModule.textLabel.setText("Profile cycleled.");
    }

    public void unassigned(){
        activeModules.textModule.textLabel.setText("This key is unnasigned.");
    }

    public void keyArrowUp(){
        activeModules.textModule.textLabel.setText("Opp");
    }

    public void keyArrowDown(){
        activeModules.textModule.textLabel.setText("Ned");
    }

    public void keyArrowLeft() {
        activeModules.textModule.textLabel.setText("Venstre");
    }

    public void keyArrowRight() {
        activeModules.textModule.textLabel.setText("Høyre");
    }

    public void key1(){
        activeModules.textModule.textLabel.setText("1");
    }

    public void key2(){
        activeModules.textModule.textLabel.setText("2");
    }

    public void key3(){
        activeModules.textModule.textLabel.setText("3");
    }

    public void key4() {
        activeModules.textModule.textLabel.setText("4");
    }

    public void key5(){
        activeModules.textModule.textLabel.setText("5");
    }

    public void key6(){
        activeModules.textModule.textLabel.setText("6");
    }

    public void key7(){
        activeModules.textModule.textLabel.setText("7");
    }

    public void key8(){
        activeModules.textModule.textLabel.setText("8");
    }

    public void key9(){
        activeModules.textModule.textLabel.setText("9");
    }

    public void key0(){
        activeModules.textModule.textLabel.setText("0");
    }

    public void keyQ(){
        activeModules.textModule.textLabel.setText("Q");
    }

    public void keyW(){
        activeModules.textModule.textLabel.setText("W");
    }

    public void keyE(){
        activeModules.textModule.textLabel.setText("E");
    }

    public void keyR(){
        activeModules.textModule.textLabel.setText("R");
    }

    public void keyT(){
        activeModules.textModule.textLabel.setText("T");
    }

    public void keyY() {
        activeModules.textModule.textLabel.setText("Y");
    }

    public void keyU() {
        activeModules.textModule.textLabel.setText("U");
    }

    public void keyI(){
        activeModules.textModule.textLabel.setText("I");
    }

    public void keyO(){
        activeModules.textModule.textLabel.setText("O");
    }

    public void keyP(){
        activeModules.textModule.textLabel.setText("P");
    }

    public void keyA(){
        activeModules.textModule.textLabel.setText("A");
    }

    public void keyS(){
        activeModules.textModule.textLabel.setText("S");
    }

    public void keyD(){
        activeModules.textModule.textLabel.setText("d");
    }

    public void keyF(){
        activeModules.textModule.textLabel.setText("F");
    }

    public void keyG(){
        activeModules.textModule.textLabel.setText("G");
    }

    public void keyH(){
        activeModules.textModule.textLabel.setText("H");
    }

    public void keyJ(){
        activeModules.textModule.textLabel.setText("J");
    }

    public void keyK(){
        activeModules.textModule.textLabel.setText("K");
    }

    public void keyL(){
        activeModules.textModule.textLabel.setText("L");
    }

    public void keyZ(){
        activeModules.textModule.textLabel.setText("Z");
    }

    public void keyX(){
        activeModules.textModule.textLabel.setText("X");
    }

    public void keyC(){
        activeModules.textModule.textLabel.setText("C");
    }

    public void keyV(){
        activeModules.textModule.textLabel.setText("V");
    }

    public void keyB(){
        activeModules.textModule.textLabel.setText("B");
    }

    public void keyN(){
        activeModules.textModule.textLabel.setText("N");
    }

    public void keyM(){
        activeModules.textModule.textLabel.setText("M");
    }

    public void keyBackSpace(){
        activeModules.textModule.textLabel.setText("Lukker vindu");
        activeModules.textModule.outputWindow.dispose();
    }
}




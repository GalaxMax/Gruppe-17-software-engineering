import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import modules.ActiveModules;
import profiles.*;

public class SmartInput {

        private int profileNumber=0;
        private ProfileTemplate profile;
        private final ActiveModules activeModules;

        public SmartInput(ActiveModules activeModules) {
                this.activeModules = activeModules;
                this.profile = new ProfileDefault(activeModules);

                KeyHandler kHandler = new KeyHandler();
                activeModules.remoteControl.outputWindow.addKeyListener(kHandler); //this is the emulated/digital remote controller
        }

        public class KeyHandler implements KeyListener{
                @Override
                public void keyPressed(KeyEvent e) {

                        switch(e.getKeyCode()){
                                case KeyEvent.VK_1:
                                        profile.key1();
                                        break;
                                case KeyEvent.VK_2:
                                        profile.key2();
                                        break;
                                case KeyEvent.VK_3:
                                        profile.key3();
                                        break;
                                case KeyEvent.VK_4:
                                        profile.key4();
                                        break;
                                case KeyEvent.VK_5:
                                        profile.key5();
                                        break;
                                case KeyEvent.VK_6:
                                        profile.key6();
                                        break;
                                case KeyEvent.VK_7:
                                        profile.key7();
                                        break;
                                case KeyEvent.VK_8:
                                        profile.key8();
                                        break;
                                case KeyEvent.VK_9:
                                        profile.key9();
                                        break;
                                case KeyEvent.VK_0:
                                        profile.key0();
                                        break;
                                case KeyEvent.VK_LEFT:
                                        profile.keyArrowLeft();
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        profile.keyArrowRight();
                                        break;
                                case KeyEvent.VK_UP:
                                        profile.keyArrowUp();
                                        break;
                                case KeyEvent.VK_DOWN:
                                        profile.keyArrowDown();
                                        break;
                                case KeyEvent.VK_Q:
                                        profile.keyQ();
                                        break;
                                case KeyEvent.VK_W:
                                        profile.keyW();
                                        break;
                                case KeyEvent.VK_E:
                                        profile.keyE();
                                        break;
                                case KeyEvent.VK_R:
                                        profile.keyR();
                                        break;
                                case KeyEvent.VK_T:
                                        profile.keyT();
                                        break;
                                case KeyEvent.VK_Y:
                                        profile.keyY();
                                        break;
                                case KeyEvent.VK_U:
                                        profile.keyU();
                                        break;
                                case KeyEvent.VK_I:
                                        profile.keyI();
                                        break;
                                case KeyEvent.VK_O:
                                        profile.keyO();
                                        break;
                                case KeyEvent.VK_P:
                                        profile.keyP();
                                        break;
                                case KeyEvent.VK_A:
                                        profile.keyA();
                                        break;
                                case KeyEvent.VK_S:
                                        profile.keyS();
                                        break;
                                case KeyEvent.VK_D:
                                        profile.keyD();
                                        break;
                                case KeyEvent.VK_F:
                                        profile.keyF();
                                        break;
                                case KeyEvent.VK_G:
                                        profile.keyG();
                                        break;
                                case KeyEvent.VK_H:
                                        profile.keyH();
                                        break;
                                case KeyEvent.VK_J:
                                        profile.keyJ();
                                        break;
                                case KeyEvent.VK_K:
                                        profile.keyK();
                                        break;
                                case KeyEvent.VK_L:
                                        profile.keyL();
                                        break;
                                case KeyEvent.VK_Z:
                                        profile.keyZ();
                                        break;
                                case KeyEvent.VK_X:
                                        profile.keyX();
                                        break;
                                case KeyEvent.VK_C:
                                        profile.keyC();
                                        break;
                                case KeyEvent.VK_V:
                                        profile.keyV();
                                        break;
                                case KeyEvent.VK_B:
                                        profile = new ProfileDefault(activeModules);
                                        break;
                                case KeyEvent.VK_N:
                                        profile = new ProfileOne(activeModules);
                                        break;
                                case KeyEvent.VK_M:
                                        profile = new ProfileTwo(activeModules);
                                        break;
                                case KeyEvent.VK_ENTER:
                                        profile.profileCycle();
                                        if(profileNumber==0){
                                                profileNumber++;
                                                profile = new ProfileOne(activeModules);
                                        }
                                        else if (profileNumber==1) {
                                                profileNumber++;
                                                profile = new ProfileTwo(activeModules);
                                        }
                                        else if(profileNumber==2){
                                                profileNumber=0;
                                                profile = new ProfileDefault(activeModules);
                                        }
                                        break;
                                case KeyEvent.VK_BACK_SPACE:
                                        profile.keyBackSpace();
                                        break;
                                default:        //if no method for pressed button, then run this
                                        profile.unassigned();
                                        break;
                        }
                }
                @Override       //necessary overrides
                public void keyReleased(KeyEvent e) {

                }
                @Override
                public void keyTyped(KeyEvent e) {

                }
        }
}



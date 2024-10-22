import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import output.ActiveOutputs;
import profiles.ProfileDefault;
import profiles.ProfileOne;

public class SmartInput {

        //private IoTSystem system;
        private ActiveOutputs activeOutputs;
        ProfileDefault profile;

        public SmartInput(ActiveOutputs activeOutputs) {
                this.activeOutputs=activeOutputs;

                KeyHandler kHandler = new KeyHandler();
                activeOutputs.remoteControl.outputWindow.addKeyListener(kHandler);
                this.profile = new ProfileDefault(activeOutputs);
        }

        public class KeyHandler implements KeyListener{

                @Override
                public void keyTyped(KeyEvent e) {

                }

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
                                        profile.arrowLeft();
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        profile.arrowRight();
                                        break;
                                case KeyEvent.VK_UP:
                                        profile.arrowUp();
                                        break;
                                case KeyEvent.VK_DOWN:
                                        profile.arrowDown();
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
                                case KeyEvent.VK_BACK_SPACE:
                                        profile.keyBackSpace();
                                        break;
                                case KeyEvent.VK_O:
                                        profile.keyO();
                                        break;
                                case KeyEvent.VK_P:
                                        profile.keyP();
                                        break;
                                //case KeyEvent.VK_H:
                                        //profile = new ProfileOne(activeOutputs);
                                default:
                                        profile.unnassigned();
                                        break;
                        }
                }
                @Override
                public void keyReleased(KeyEvent e) {

                }
        }
}



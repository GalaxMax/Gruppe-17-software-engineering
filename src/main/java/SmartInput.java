import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import output.Output;
import profiles.ProfileDefault;
import profiles.ProfileOne;

public class SmartInput {

        JFrame FK; // FK = Fjern-Kontroll
        JPanel panel;
        JLabel textLabel;

        private Output output = new Output();
        private IoTSystem system;

        ProfileDefault profil = new ProfileDefault(output);

        public SmartInput(IoTSystem system) {
                this.system = system;

                Font font = new Font("Times New Roman", Font.PLAIN, 28);

                KeyHandler kHandler = new KeyHandler();

                FK = new JFrame();
                FK.setSize(800,600);
                FK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                FK.getContentPane().setBackground(Color.black);
                FK.setLayout(null);
                FK.addKeyListener(kHandler);

                panel = new JPanel();
                panel.setBounds(100, 150, 600, 250);
                panel.setBackground(Color.black);
                panel.setLayout(new GridLayout(2,1));
                FK.add(panel);

                textLabel = new JLabel();
                textLabel.setBackground(Color.black);
                textLabel.setForeground(Color.white);
                textLabel.setFont(font);
                panel.add(textLabel);
                textLabel.setText("Dette er fjernkontrollen. Trykk en knapp!");

                FK.setVisible(true);
        }

        public class KeyHandler implements KeyListener{

                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {

                        switch(e.getKeyCode()){
                                case KeyEvent.VK_1: // Denne kommer til å bli profil 1 knapp.
                                        profil.key1();
                                        break;
                                case KeyEvent.VK_2: // Denne kommer til å bli profil 2 knapp.
                                        profil.key2();
                                        break;
                                case KeyEvent.VK_3: // Denne kommer til å bli profil 3 knapp.
                                        profil.key3();
                                        break;
                                case KeyEvent.VK_4: // Denne kommer til å bli profil 1 knapp.
                                        profil.key4();
                                        break;
                                case KeyEvent.VK_5: // Denne kommer til å bli profil 2 knapp.
                                        profil.key5();
                                        break;
                                case KeyEvent.VK_6: // Denne kommer til å bli profil 3 knapp.
                                        profil.key6();
                                        break;
                                case KeyEvent.VK_7: // Denne kommer til å bli profil 1 knapp.
                                        profil.key7();
                                        break;
                                case KeyEvent.VK_8: // Denne kommer til å bli profil 2 knapp.
                                        profil.key8();
                                        break;
                                case KeyEvent.VK_9: // Denne kommer til å bli profil 3 knapp.
                                        profil.key9();
                                        break;
                                case KeyEvent.VK_0: // Denne kommer til å bli profil 3 knapp.
                                        profil.key0();
                                        break;
                                case KeyEvent.VK_LEFT:
                                        profil.arrowLeft();
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        profil.arrowRight();
                                        break;
                                case KeyEvent.VK_UP:
                                        profil.arrowUp();
                                        break;
                                case KeyEvent.VK_DOWN:
                                        profil.arrowDown();
                                        break;
                                case KeyEvent.VK_Q:
                                        profil.keyQ();
                                        break;
                                case KeyEvent.VK_W:
                                        profil.keyW();
                                        break;
                                case KeyEvent.VK_E:
                                        profil.keyE();
                                        break;
                                case KeyEvent.VK_R:
                                        profil.keyR();
                                        break;
                                case KeyEvent.VK_T:
                                        profil.keyT();
                                        break;
                                case KeyEvent.VK_Y:
                                        profil.keyY();
                                        break;
                                case KeyEvent.VK_BACK_SPACE:
                                        profil.keyBackSpace();
                                    break;
                                case KeyEvent.VK_O:
                                        system.getArrIoTLights()[0].updateLight(true);
                                        break;
                                case KeyEvent.VK_P:
                                        system.getArrIoTLights()[0].updateLight(false);
                                        break;
                                case KeyEvent.VK_H:
                                        profil = new ProfileOne(output);
                                default:
                                        output.textLabel.setText("Unassigned");
                                        break;
                        }

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
        }
}



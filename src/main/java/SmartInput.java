import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import output.Output;
import profiles.DefaultProfile;

public class SmartInput {

        JFrame FK; // FK = Fjern-Kontroll
        JPanel panel;
        JLabel textLabel;

        private Output outPut = new Output();
        private IoTSystem system;

        DefaultProfile profil = new DefaultProfile(outPut);

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
                                        outPut.textLabel.setText("Profil 1!");
                                        break;
                                case KeyEvent.VK_2: // Denne kommer til å bli profil 2 knapp.
                                        outPut.textLabel.setText("Profil 2!");
                                        break;
                                case KeyEvent.VK_3: // Denne kommer til å bli profil 3 knapp.
                                        outPut.textLabel.setText("Profil 3!");
                                        break;
                                case KeyEvent.VK_LEFT:
                                        profil.arrowLeft();
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        profil.arrowRight();
                                        break;
                                case KeyEvent.VK_A:
                                        profil.keyA();
                                        break;
                                case KeyEvent.VK_C:
                                        profil.keyC();
                                        break;
                                case KeyEvent.VK_O:
                                        system.getArrIoTLights()[0].updateLight(true);
                                        break;
                                case KeyEvent.VK_P:
                                        system.getArrIoTLights()[0].updateLight(false);
                                        break;
                                default:
                                        outPut.textLabel.setText("Kul knapp!");
                                        break;
                        }

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
        }
}



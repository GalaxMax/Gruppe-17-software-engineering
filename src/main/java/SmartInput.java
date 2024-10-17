import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SmartInput {

        JFrame FK; // FK = Fjern-Kontroll
        JPanel panel;
        JLabel textLabel;

        private final Output output = new Output();

        private final IoTSystem system;

        public SmartInput(IoTSystem system) {
                this.system = system;

                Font font = new Font("Times New Roman", Font.PLAIN, 28);

                KeyHandler kHandler = new KeyHandler();

                // Create a new JFrame
                FK = new JFrame();
                FK.setSize(527, 1503);
                FK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                FK.setLayout(null);
                FK.addKeyListener(kHandler);

                // Create a custom JPanel to paint the background image
                JPanel imagePanel = new JPanel() {
                        @Override
                        protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                // Load the image
                                ImageIcon imageIcon = new ImageIcon(SmartInput.class.getResource("fjernkontroller.png"));

                                // Get the image from the ImageIcon
                                Image img = imageIcon.getImage();

                                // Draw the image to fill the entire panel
                                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
                        }
                };

                // Set the size and layout for the custom panel
                imagePanel.setBounds(0, 0, 527, 1503);
                imagePanel.setLayout(null); // No layout as it's a background panel

                // Add the custom image panel to the JFrame
                FK.add(imagePanel);

                // Make the JFrame visible
                FK.setVisible(true);
        }

        public class KeyHandler implements KeyListener{

                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {

                        switch(e.getKeyCode()){
                                case KeyEvent.VK_1:
                                        output.textLabel.setText("1!");
                                        break;
                                case KeyEvent.VK_2:
                                        output.textLabel.setText("2. wow!");
                                        break;
                                case KeyEvent.VK_LEFT:
                                        output.textLabel.setText("Det var venstre, gitt!");
                                        break;
                                case KeyEvent.VK_RIGHT:
                                        output.textLabel.setText("Høyre, nice!");
                                        break;
                                case KeyEvent.VK_A:
                                        output.textLabel.setText("AAAAAAAAAAAA");
                                        break;
                                case KeyEvent.VK_U:
                                        system.getArrIoTHUELights()[0].toggleLight();
                                        break;
                                case KeyEvent.VK_I:
                                        system.getArrIoTHUELights()[1].toggleLight();
                                        break;
                                case KeyEvent.VK_O:
                                        system.getArrIoTHUELights()[2].toggleLight();
                                        break;
                                case KeyEvent.VK_P:
                                        system.getArrIoTHUELights()[3].toggleLight();
                                        break;
                                default:
                                        output.textLabel.setText("Kul knapp!");
                                        break;
                        }

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
        }
}



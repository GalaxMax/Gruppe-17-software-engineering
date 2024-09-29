package main.java;
import java.awt.event.KeyEvent;
import java.util.Scanner;
public class SmartInput {

        private Scanner deviceInput;
        public SmartInput() {
                deviceInput = new Scanner(System.in);
        }
        public String readInput() {
                System.out.print("press button");
                return deviceInput.nextLine();
        }
        public void closeDevice() {
                if (deviceInput != null) {
                        deviceInput.close();
                        System.out.println("bye.");
                }
        }
        public void keyPressed(KeyEvent e) {
                int Key = e.getKeyCode();
                switch (Key) {
                        case KeyEvent.VK_LEFT:
                                System.out.println("hello");
                                break;
                        case KeyEvent.VK_RIGHT:
                                System.out.println("hello2");
                                break;
                }
        }
        public static void main(String[] args) {
                SmartInput handler = new SmartInput();
                String Smartinput = handler.readInput();
                System.out.println(Smartinput);
                handler.closeDevice();
        }

}

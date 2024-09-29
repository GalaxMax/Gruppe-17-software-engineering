package main.java;
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
        public static void main(String[] args) {
                SmartInput handler = new SmartInput();
                String Smartinput = handler.readInput();
                System.out.println(Smartinput);
                handler.closeDevice();
        }

}

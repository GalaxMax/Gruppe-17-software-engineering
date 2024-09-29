import java.util.Scanner;
public class Input {

        private Scanner deviceInput;
        public Input() {
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
                Input handler = new Input();
                String input = handler.readInput();
                System.out.println(input);
                handler.closeDevice();
        }

}

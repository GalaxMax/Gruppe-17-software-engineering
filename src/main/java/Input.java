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
        public static void main(String[] args) {
                DeviceInputHandler handler = new DeviceInputHandler();
                String input = handler.readInput();
                System.out.println(input);
        }
}

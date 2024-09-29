import java.util.Scanner;
public class Input {
        //
        private Scanner deviceInput;
        public Input() {
                deviceInput = new Scanner(System.in);
        }
        public String readInput() {
                System.out.print("press button");
                return deviceInput.nextLine();
        }
}

import main.java.SmartInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new SmartInput();
        Output testOutput = new Output("4096");
        System.out.println(testOutput);
        System.out.println(testOutput.getOutputToInt());
    }
}
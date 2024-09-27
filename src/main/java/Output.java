public class Output {
    private String input;
    public Output(String input) {
        setInput(input);
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getInput() {
        return this.input;
    }
    public int getOutputToInt() {
        int intInput;
        try {
            intInput = Integer.parseInt(input);
            return intInput;
        }
        catch (NumberFormatException e) {
            System.out.println("Input var ikke en int.");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Denne initialiserte klassen har verdien: " + getInput();
    }
}

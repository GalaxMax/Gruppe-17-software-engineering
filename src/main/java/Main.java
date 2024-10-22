import output.ActiveOutputs;

public class Main {
    public static void main(String[] args) {
        ActiveOutputs IoTSystems = new ActiveOutputs();
        new SmartInput(IoTSystems);
    }
}
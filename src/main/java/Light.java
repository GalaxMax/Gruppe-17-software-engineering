public class Light implements Device {
    private boolean isOn;
    private int brightness;

    public Light() {
        this.isOn = false;
        this.brightness = 50;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Light is now ON.");
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("Light is now OFF.");
    }

    @Override
    public boolean isPoweredOn() {
        return this.isOn;
    }

    public void dimLight(int brightness) {
        if (isOn) {
            this.brightness = brightness;
            System.out.println("Light brightness set to: " + brightness);
        } else {
            System.out.println("Light is off. Can't dim.");
        }
    }
}

package commandPattern;

public class Light {
    private int brightness = 0;

    public String switchOn(int brightness) {
        this.brightness = brightness;
        return "Light is switched-on! Brightness: " + this.brightness;
    }

    public String switchOff() {
        this.brightness = 0;
        return "Light is switched-off! Brightness: " + this.brightness;
    }
}

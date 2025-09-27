package commandPattern;

public class LightsOn implements Command {
    private Light light;
    private int brightness;

    public LightsOn(Light light, int brightness){
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public String execute() {
        return light.switchOn(brightness);
    }
}
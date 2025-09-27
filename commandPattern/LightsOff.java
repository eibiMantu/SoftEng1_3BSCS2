package commandPattern;

public class LightsOff implements Command {
    private Light light;

    public LightsOff(Light light){
        this.light = light;
    }

    @Override
    public String execute() {
        return light.switchOff();
    }
}
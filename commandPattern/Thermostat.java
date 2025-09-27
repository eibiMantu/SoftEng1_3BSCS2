package commandPattern;

public class Thermostat {
    private int temperature = 22; 

    public String switchOn() {
        return "Thermostat is switched-on! Current temperature: " + temperature + "°C";
    }

    public String switchOff() {
        return "Thermostat is switched-off!";
    }

    public String tempUp() {
        temperature++;
        return "Temperature increased to " + temperature + "°C";
    }

    public String tempDown() {
        temperature--;
        return "Temperature decreased to " + temperature + "°C";
    }
}

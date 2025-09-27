package commandPattern;

public class TempDown implements Command {
    private Thermostat thermostat;

    public TempDown(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.tempDown();
    }
}

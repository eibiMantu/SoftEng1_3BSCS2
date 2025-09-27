package commandPattern;

public class TempUp implements Command {
	private Thermostat thermostat;

	public TempUp(Thermostat thermostat){
		this.thermostat = thermostat;
	}

	@Override
	public String execute() {
		return thermostat.tempUp();
	}
}
package commandPattern;

public class RemoteControl {
    private Command tvCommand;
    private Command lightCommand;
    private Command tempUpCommand;
    private Command tempDownCommand;
    private Command musicCommand;

    public void setTvCommand(Command command) {
        this.tvCommand = command;
    }

    public void setLightCommand(Command command) {
        this.lightCommand = command;
    }

    public void setTempUpCommand(Command command) {
        this.tempUpCommand = command;
    }

    public void setTempDownCommand(Command command) {
        this.tempDownCommand = command;
    }

    public void setMusicCommand(Command command) {
        this.musicCommand = command;
    }

    public String pressTvButton() {
        if (tvCommand != null) {
            return tvCommand.execute();
        } else {
            return "No command assigned to TV button.";
        }
    }

    public String pressLightButton() {
        if (lightCommand != null) {
            return lightCommand.execute();
        } else {
            return "No command assigned to Light button.";
        }
    }

    public String pressTempUpButton() {
        if (tempUpCommand != null) {
            return tempUpCommand.execute();
        } else {
            return "No command assigned to Temp Up button.";
        }
    }

    public String pressTempDownButton() {
        if (tempDownCommand != null) {
            return tempDownCommand.execute();
        } else {
            return "No command assigned to Temp Down button.";
        }
    }

    public String pressMusicButton() {
        if (musicCommand != null) {
            return musicCommand.execute();
        } else {
            return "No command assigned to Music button.";
        }
    }
}
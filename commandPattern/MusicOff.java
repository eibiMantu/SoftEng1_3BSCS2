package commandPattern;

public class MusicOff implements Command {
    private MusicSystem musicSystem;

    public MusicOff(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public String execute() {
        return musicSystem.switchOff();
    }
}

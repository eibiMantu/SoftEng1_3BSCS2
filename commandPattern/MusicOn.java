package commandPattern;

public class MusicOn implements Command {
    private MusicSystem musicSystem;
    private String playlist;

    public MusicOn(MusicSystem musicSystem, String playlist) {
        this.musicSystem = musicSystem;
        this.playlist = playlist;
    }

    @Override
    public String execute() {
        return musicSystem.playPlaylist(playlist);
    }
}

package commandPattern;

public class MusicSystem {
    public String switchOn() {
        return "Music system is switched-on! Playing music.";
    }

    public String playPlaylist(String playlist) {
        return "Music system is switched-on! Playing playlist: " + playlist;
    }

    public String switchOff() {
        return "Music system is switched-off!";
    }
}

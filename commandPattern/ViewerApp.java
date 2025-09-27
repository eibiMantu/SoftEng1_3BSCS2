package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        Light light = new Light();
        MusicSystem musicSystem = new MusicSystem();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        PowerOff powerOff = new PowerOff(tv);
        LightsOn lightsOn = new LightsOn(light, 75); // Set brightness to 75
        LightsOff lightsOff = new LightsOff(light);
        MusicOn musicOn = new MusicOn(musicSystem, "Chill Vibes"); // Play 'Chill Vibes' playlist
        MusicOff musicOff = new MusicOff(musicSystem);

        rc.setTvCommand(powerOn);
        System.out.println(rc.pressTvButton());

        rc.setTvCommand(powerOff);
        System.out.println(rc.pressTvButton());

        rc.setLightCommand(lightsOn);
        System.out.println(rc.pressLightButton());

        rc.setLightCommand(lightsOff);
        System.out.println(rc.pressLightButton());

        rc.setMusicCommand(musicOn);
        System.out.println(rc.pressMusicButton());

        rc.setMusicCommand(musicOff);
        System.out.println(rc.pressMusicButton());
    }
}
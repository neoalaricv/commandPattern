package commandPattern;

public class RemoteControl {
    Light light = new Light();
    Aircon aircon = new Aircon();
    MusicPlayer musicPlayer = new MusicPlayer();
    LightsTurnOn lightsTurnOn = new LightsTurnOn(light);
    LightsTurnOff lightsTurnOff = new LightsTurnOff(light);
    ChangeTone changeTone = new ChangeTone(light);
    IncreaseTemp increaseTemp = new IncreaseTemp(aircon);
    DecreaseTemp decreaseTemp = new DecreaseTemp(aircon);
    Swing swing = new Swing(aircon);
    VolUp musicVolumeUp = new VolUp(musicPlayer);
    VolDown musicVolumeDown = new VolDown(musicPlayer);
    PlayMusic playMusic = new PlayMusic(musicPlayer);
    PauseMusic pauseMusic = new PauseMusic(musicPlayer);
    MuteMusic muteMusic = new MuteMusic(musicPlayer);

    public void clickLightsSwitch(int sw) {
        if (sw == 0) {
            System.out.println(lightsTurnOn.execute());
            System.out.println();
        } else {
            System.out.println(lightsTurnOff.execute());
            System.out.println();
        }
    }

    public void clickChangeTone() {
        System.out.println(changeTone.execute());
        System.out.println();
    }

    public void clickIncreaseTemp() {
        System.out.println(increaseTemp.execute());
        System.out.println();
    }

    public void clickDecreaseTemp() {
        System.out.println(decreaseTemp.execute());
        System.out.println();
    }
    public void clickSwing(){
        System.out.println(swing.execute());
        System.out.println();
    }


    public void clickVolumeUp() {
        System.out.println(musicVolumeUp.execute());
        System.out.println();
    }

    public void clickVolumeDown() {
        System.out.println(musicVolumeDown.execute());
        System.out.println();
    }

    public void clickMusicPlayerButton(int sw) {
        if (sw == 0) {
            System.out.println(playMusic.execute());
            System.out.println();
        } else {
            System.out.println(pauseMusic.execute());
            System.out.println();
        }
    }

    public void clickMuteMusic() {
        System.out.println(muteMusic.execute());
        System.out.println();
    }
}

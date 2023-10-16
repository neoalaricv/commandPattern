package commandPattern;

public class MuteMusic implements Main {

    private MusicPlayer musPlayer;

    public MuteMusic(MusicPlayer musPlayer) {
        this.musPlayer = musPlayer;
    }

    @Override
    public String execute() {
        return musPlayer.mute();
    }

}

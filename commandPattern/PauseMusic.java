package commandPattern;

public class PauseMusic implements Main {

    private MusicPlayer musPlayer;

    public PauseMusic(MusicPlayer musPlayer) {
        this.musPlayer = musPlayer;
    }

    @Override
    public String execute() {
        return musPlayer.pause();
    }

}

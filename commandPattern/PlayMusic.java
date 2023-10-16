package commandPattern;

public class PlayMusic implements Main {

    private MusicPlayer musPlayer;

    public PlayMusic(MusicPlayer musPlayer) {
        this.musPlayer = musPlayer;
    }

    @Override
    public String execute() {
        return musPlayer.play();
    }

}

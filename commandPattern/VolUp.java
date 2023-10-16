package commandPattern;

public class VolUp implements Main {

    private MusicPlayer musPlayer;

    public VolUp(MusicPlayer musPlayer) {
        this.musPlayer = musPlayer;
    }

    @Override
    public String execute() {
        return musPlayer.volUp();
    }

}
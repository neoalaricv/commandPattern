package commandPattern;

public class VolDown implements Main {

    private MusicPlayer musPlayer;

    public VolDown(MusicPlayer musPlayer) {
        this.musPlayer = musPlayer;
    }

    @Override
    public String execute() {
        return musPlayer.volDown();
    }

}
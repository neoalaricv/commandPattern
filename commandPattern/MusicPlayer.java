package commandPattern;

public class MusicPlayer {

    public String volUp() {
        return "The music volume have increased!";
    }

    public String volDown() {
        return "The music volume have decreased!";
    }

    public String play() {
        return "The music is now playing!";
    }

    public String pause() {
        return "You have paused the music!";
    }

    public String mute() {
        return "You have put it on mute!";
    }
}

package commandPattern;

public class Swing implements Main {

    private Aircon aircon;

    public Swing(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public String execute() {
        return aircon.swing();
    }

}
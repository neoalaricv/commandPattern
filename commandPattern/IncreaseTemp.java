package commandPattern;

public class IncreaseTemp implements Main {

    private Aircon aircon;

    public IncreaseTemp(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public String execute() {
        return aircon.tempUp();
    }

}
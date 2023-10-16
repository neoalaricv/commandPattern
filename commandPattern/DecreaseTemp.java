package commandPattern;

public class DecreaseTemp implements Main {

    private Aircon aircon;

    public DecreaseTemp(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public String execute() {
        return aircon.tempDown();
    }

}

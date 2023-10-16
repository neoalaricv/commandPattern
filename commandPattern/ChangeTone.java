package commandPattern;

public class ChangeTone implements Main {

    private Light lights;

    public ChangeTone(Light lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.changeTone();
    }

}
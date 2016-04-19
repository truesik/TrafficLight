package light;

public abstract class Light {
    private boolean on = false;

    abstract Color getColor();

    public void turnOn() {
        on = true;
        System.out.println(getColor() + " light turns on");
    }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
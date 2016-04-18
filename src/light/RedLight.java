package light;

public class RedLight extends Light {
    public RedLight(int duration) {
        this.duration = duration;
    }

    @Override
    public Color getColor() {
        return Color.Red;
    }
}

package light;

public class GreenLight extends Light {
    public GreenLight(int duration) {
        this.duration = duration;
    }

    @Override
    public Color getColor() {
        return Color.Green;
    }
}

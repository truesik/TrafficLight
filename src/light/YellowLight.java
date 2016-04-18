package light;

public class YellowLight extends Light {
    public YellowLight(int duration) {
        this.duration = duration;
    }

    @Override
    public Color getColor() {
        return Color.Yellow;
    }
}
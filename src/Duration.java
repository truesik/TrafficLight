public class Duration {
    private final int greenDurationInSeconds;
    private final int yellowDurationInSeconds;
    private final int redLightDurationInSeconds;

    public Duration(int greenDurationInSeconds, int yellowDurationInSeconds,  int redLightDurationInSeconds) {
        this.greenDurationInSeconds = greenDurationInSeconds;
        this.yellowDurationInSeconds = yellowDurationInSeconds;
        this.redLightDurationInSeconds = redLightDurationInSeconds;
    }

    public int getGreenDurationInSeconds() {
        return greenDurationInSeconds;
    }

    public int getYellowDurationInSeconds() {
        return yellowDurationInSeconds;
    }

    public int getRedLightDurationInSeconds() {
        return redLightDurationInSeconds;
    }
}

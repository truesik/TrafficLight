import light.GreenLight;
import light.RedLight;
import light.YellowLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLightImp(new GreenLight(), new YellowLight(), new RedLight());
        TrafficLightController trafficLightController = new TrafficLightController(trafficLight);
        Duration duration = new DurationReader().read();
        trafficLightController.run(duration);
    }
}

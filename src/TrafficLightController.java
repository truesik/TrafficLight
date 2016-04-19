import java.util.Scanner;

public class TrafficLightController {
    private TrafficLight trafficLight;
    private boolean stop = false;

    public TrafficLightController(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public void run(Duration duration) {
        stopSeeker();
        while (!isStop()) {
            trafficLight.turnOnGreenLight(duration.getGreenDurationInSeconds());
            trafficLight.turnOnYellowLight(duration.getYellowDurationInSeconds());
            trafficLight.turnOnRedLight(duration.getRedLightDurationInSeconds());
        }
        System.out.println("Светофор остановлен");
    }

    private boolean isStop() {
        return stop;
    }

    private void stopSeeker() {
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Чтобы остановить светофор наберите \"stop\"");
            while (!stop) {
                String line = scanner.nextLine();
                if (line.equals("stop")) {
                    stop = true;
                }
            }
        }).start();
    }
}

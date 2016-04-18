import light.GreenLight;
import light.Light;
import light.RedLight;
import light.YellowLight;

public class TrafficLight implements Runnable {
    private Light redLight;
    private Light yellowLight;
    private Light greenLight;

    public TrafficLight(int ...durationInSeconds) {
        redLight = new RedLight(durationInSeconds[0]);
        yellowLight = new YellowLight(durationInSeconds[1]);
        greenLight = new GreenLight(durationInSeconds[2]);
    }

    @Override
    public void run() {
        while (true) {
            startThread(greenLight);
            startThread(yellowLight);
            startThread(redLight);
        }
    }

    private void startThread(Light light) {
        Thread thread = new Thread(light);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

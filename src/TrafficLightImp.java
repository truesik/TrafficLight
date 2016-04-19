import light.Light;

import java.util.concurrent.TimeUnit;

public class TrafficLightImp implements TrafficLight {
    private Light greenLight;
    private Light yellowLight;
    private Light redLight;

    public TrafficLightImp(Light greenLight, Light yellowLight, Light redLight) {
        this.greenLight = greenLight;
        this.yellowLight = yellowLight;
        this.redLight = redLight;
    }

    @Override
    public void turnOnGreenLight(int duration) {
        greenLight.turnOn();
        wait(duration);
        greenLight.turnOff();
    }

    @Override
    public void turnOnYellowLight(int duration) {
        yellowLight.turnOn();
        wait(duration);
        yellowLight.turnOff();
    }

    @Override
    public void turnOnRedLight(int duration) {
        redLight.turnOn();
        wait(duration);
        redLight.turnOff();
    }

    private void wait(int duration) {
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

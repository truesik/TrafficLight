package light;

public abstract class Light implements Runnable {
    protected int duration;
    private boolean on = false;

    abstract Color getColor();

    public void turnOn() {
        on = true;
        System.out.println(getColor() + " light turns on");
    }

    public void turnOff() {
        on = false;
        System.out.println(getColor() + " light turns off");
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public void run() {
        synchronized (this) {
            turnOn();
            if (isOn()) {
                try {
                    Thread.sleep(duration * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            turnOff();
        }
    }
}
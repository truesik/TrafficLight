import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите время работы зеленого света (в секундах):");
        Scanner scannerGreen = new Scanner(System.in);
        int greenDuration = scannerGreen.nextInt();

        System.out.println("Введите время работы желтого света (в секундах):");
        Scanner scannerYellow = new Scanner(System.in);
        int yellowDuration = scannerYellow.nextInt();

        System.out.println("Введите время работы красного света (в секундах):");
        Scanner scannerRed = new Scanner(System.in);
        int redDuration = scannerRed.nextInt();

        Thread trafficThread = new Thread(new TrafficLight(redDuration, yellowDuration, greenDuration));
        trafficThread.start();
    }
}

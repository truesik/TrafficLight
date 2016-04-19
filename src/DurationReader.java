import java.util.Scanner;

public class DurationReader {
    public Duration read() {
        System.out.println("Введите время работы зеленого света (в секундах):");
        int greenDuration = getInt();

        System.out.println("Введите время работы желтого света (в секундах):");
        int yellowDuration = getInt();

        System.out.println("Введите время работы красного света (в секундах):");
        int redDuration = getInt();

        return new Duration(redDuration, yellowDuration, greenDuration);
    }

    private int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

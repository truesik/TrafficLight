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
        int value;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (isInteger(line)) {
            if (isPositive(Integer.valueOf(line))) {
                value = Integer.valueOf(line);
            } else {
                System.err.println("Введите положительное число!");
                return getInt();
            }
        } else {
            System.err.println("Введите число!");
            return getInt();
        }
        return value;
    }

    private boolean isPositive(int value) {
        return value >= 0;
    }

    private boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

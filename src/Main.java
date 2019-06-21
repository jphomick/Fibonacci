import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Use example? Type 'example', or 'custom'.");
        String example = read.nextLine();
        if (example.contains("example")) {
            for (int i = 2; i < 11; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(getValue(j, i) + " ");
                }
                System.out.println();
            }
            System.out.print("2 ");
            for (int j = 0; j < 10; j++) {
                System.out.print(getValueLucas(j, 2) + " ");
            }
        } else{
            System.out.println("Provide a Fibonacci step degree:");
            int steps = read.nextInt();
            System.out.println("Provide the number of calculations:");
            int calcs = read.nextInt();
            for (int i = 0; i < calcs; i++) {
                System.out.print(getValue(i, steps) + " ");
            }
        }
    }

    private static int getValue(int level, int degree) {
        if (level < 0) {
            return 0;
        } else if (level == 0) {
            return 1;
        } else {
            int sum = 0;
            for (int i = 1; i <= degree; i++) {
                sum += getValue(level - i, degree);
            }
            return sum;
        }
    }

    private static int getValueLucas(int level, int degree) {
        if (level < -1) {
            return 0;
        } else if (level == -1) {
            return 2;
        } else if (level == 0) {
            return 1;
        } else {
            int sum = 0;
            for (int i = 1; i <= degree; i++) {
                sum += getValueLucas(level - i, degree);
            }
            return sum;
        }
    }
}

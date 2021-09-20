import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanutButterCups = Integer.parseInt(scanner.next());

        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            if (peanutButterCups >= 15 && peanutButterCups <= 25) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            if (peanutButterCups >= 10 && peanutButterCups <= 20) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
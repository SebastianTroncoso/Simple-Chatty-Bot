import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;

        while (scanner.hasNext()) {

            if (Integer.parseInt(scanner.next()) > 0) {
                positivos++;
            }
        }
        if (positivos == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
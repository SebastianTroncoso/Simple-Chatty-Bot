import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.next());

        if (numberInput > 0 && numberInput < 10) {

            System.out.println(true);
        }

        else {
            System.out.println(false);
        }
    }
}
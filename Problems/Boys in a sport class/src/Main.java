import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = Integer.parseInt(scanner.next());
        int h2 = Integer.parseInt(scanner.next());
        int h3 = Integer.parseInt(scanner.next());

        boolean descOrder = (h1 >= h2) && (h2 >= h3) || (h1 <= h2) && (h2 <= h3);

        System.out.println(descOrder);
    }
}
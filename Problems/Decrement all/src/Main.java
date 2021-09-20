import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.next());
        int n2 = Integer.parseInt(scanner.next());
        int n3 = Integer.parseInt(scanner.next());
        int n4 = Integer.parseInt(scanner.next());

        System.out.print(--n1 + " ");
        System.out.print(--n2 + " ");
        System.out.print(--n3 + " ");
        System.out.print(--n4);

        char c = '1' + '3';
        System.out.println(c);

    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        
        System.out.println(n%s);
    }
}
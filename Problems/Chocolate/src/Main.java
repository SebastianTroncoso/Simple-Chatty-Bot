import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        if (k == 1) {
            System.out.println("NO");
        }
        else if (k == n){
            System.out.println("YES");
        }
        else if (k == m){
            System.out.println("YES");
        }
        else if (k == (m * n) - m) {
            System.out.println("YES");
        }
        else if (k == (m * n) - n) {
            System.out.println("YES");
        }
        else if ((m * n) % k == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
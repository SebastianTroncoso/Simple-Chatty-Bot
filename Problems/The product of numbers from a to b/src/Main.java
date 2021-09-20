import  java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n1 = Integer.parseInt(scanner.next());
        long n2 = Integer.parseInt(scanner.next());
        long mult = 1;

        for (long i = n1; i < n2; i++){
            mult *= i;
        }

        System.out.println(mult);
    }
}
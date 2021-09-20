import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        String number = String.valueOf(input);

        char[] array1 = number.toCharArray();

        if (array1[0] == array1[3] && array1[1] == array1[2]) {
            System.out.println(1);
        } else {
            System.out.println(45);
        }
    }
}
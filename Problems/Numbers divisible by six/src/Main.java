import  java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfNumbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < amountOfNumbers; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 6 == 0){

                sum += number;
            }

        }

        System.out.println(sum);
    }
}
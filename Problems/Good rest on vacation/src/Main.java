import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationInDays = Integer.parseInt(scanner.next());
        int foodPerDay = Integer.parseInt(scanner.next()) * durationInDays;
        int flightCost = Integer.parseInt(scanner.next()) * 2;
        int costOneNightHotel = Integer.parseInt(scanner.next()) * (durationInDays - 1);

        System.out.println(foodPerDay + flightCost + costOneNightHotel);

    }
}
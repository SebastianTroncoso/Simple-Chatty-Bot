import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner Eduardo = new Scanner(System.in);
        String firstName = Eduardo.next();
        Eduardo.next();
        Eduardo.next();
        Eduardo.next();
        String cuisinePreference = Eduardo.next();
        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef that cooks " + cuisinePreference + " " +
                "dishes.");
    }
}
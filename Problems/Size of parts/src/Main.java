import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int referenceStandard = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> smaller = new ArrayList<Integer>();

        ArrayList<Integer> perfect = new ArrayList<Integer>();

        ArrayList<Integer> large = new ArrayList<Integer>();

        for (int i = 0; i < referenceStandard; i++){

            int parts = Integer.parseInt(scanner.nextLine());

            if (parts < 0){

                smaller.add(parts);
            }
            else if (parts == 0){

                perfect.add(parts);
            }
            else if(parts > 0){

                large.add(parts);
            }
        }

        System.out.print(perfect.size() + " ");
        System.out.print(large.size() + " ");
        System.out.print(smaller.size() + " ");

    }
}
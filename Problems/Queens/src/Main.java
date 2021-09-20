import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minSleep = Integer.parseInt(scanner.nextLine());
        int maxSleep = Integer.parseInt(scanner.nextLine());
        int annSleep = Integer.parseInt(scanner.nextLine());

        if ((annSleep >= minSleep) && (annSleep <= maxSleep)){
            System.out.println("Normal");
        }
        else if(annSleep < minSleep){
            System.out.println("Deficiency");
        } else{
            System.out.println("Excess");
        }

    }
}
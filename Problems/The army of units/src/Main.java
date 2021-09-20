import  java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nArmy = Integer.parseInt(scanner.next());

        if (nArmy <1){
            System.out.println("no army");
        }
        else if (nArmy >= 1 && nArmy <= 19) {
            System.out.println("pack");
        }
        else if (nArmy >= 20 && nArmy <= 249) {
            System.out.println("throng");
        }
        else if (nArmy >= 250 && nArmy <= 999) {
            System.out.println("zounds");
        }
        else if (nArmy >= 1000) {
            System.out.println("legion");
        }
    }
}
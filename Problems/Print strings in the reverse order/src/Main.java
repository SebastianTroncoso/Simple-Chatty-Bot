import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[3];

        for(int i = 0; i<3; i++){
            arr[i] = scanner.next();
        }
        for(int i= arr.length -1; i>= 0; i--)
        System.out.println(arr[i]);
    }
}
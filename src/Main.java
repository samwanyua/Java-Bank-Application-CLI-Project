import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new integer:");
        int x = scanner.nextInt();

        System.out.print("Enter a new character:");
        char c = scanner.next().charAt(0);


        System.out.println( "The new integer input is " + x);
        System.out.println( "The new character input is " + c);
    }
}
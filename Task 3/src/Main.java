import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = n % 10;
        int second = n / 100;
        int third = (n / 10) % 10;
        System.out.println(first + second + third);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int result = q/w;
        int modulo = q%w;
        System.out.println(q + " / " + w + " = " + result + ", остаток равен " + modulo + ".");
    }
}
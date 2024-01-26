import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b, c, block1, block2;
        double block3, result, result2;

        System.out.println("Welcome to the CLI Quadratic Equation Calculator\n");

        System.out.print("A: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        System.out.print("B: ");
        b = scanner.nextFloat();
        System.out.print("C: ");
        c = scanner.nextFloat();

        block1 = -1 * b;
        block2 = 2 * a;
        block3 = (Math.sqrt((b * b) - (4 * a * c)));

        result = (block1 + block3) / block2;
        result2 = (block1 - block3) / block2;
        System.out.printf("X = %f or %f\n", result, result2);
    }
}
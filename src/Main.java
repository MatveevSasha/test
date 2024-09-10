import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите действие");
            char operator = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            Calculator calculator = new Calculator();
            int result = calculator.calculator(a, b, operator);
            System.out.println("Результат равен " + result);
        }
    }
}
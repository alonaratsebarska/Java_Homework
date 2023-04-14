/* Реализовать простой калькулятор */

import java.util.Scanner;

public class Sem1_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Деление на ноль невозможно!");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Некорректная операция!");
                return;
        }

        System.out.printf("Результат: %.2f %c %.2f = %.2f%n", firstNumber, operation, secondNumber, result);
    }
}


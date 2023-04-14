/* Вывести все простые числа от 1 до 1000 */

public class Sem1_Task2 {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 1000;

        System.out.println("Простые числа от " + lowerBound + " до " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
